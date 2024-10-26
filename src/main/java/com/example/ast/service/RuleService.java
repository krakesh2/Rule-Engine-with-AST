package com.example.ast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ast.dto.RuleDto;
import com.example.ast.entity.Node;
import com.example.ast.entity.Rule;
import com.example.ast.entity.UserAttributes;
import com.example.ast.repository.RuleRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RuleService {

	@Autowired
	private RuleRepository ruleRepository;

	public void createRule(RuleDto ruleDTO) {
		Rule rule = new Rule();
		rule.setRuleName(ruleDTO.getRuleName());
		rule.setRuleAst(ruleDTO.getRuleAst()); // Store AST as JSON in DB
		ruleRepository.save(rule);
	}

	public boolean evaluateUser(UserAttributes attributes) throws JsonMappingException, JsonProcessingException {
		List<Rule> rules = ruleRepository.findAll();
		for (Rule rule : rules) {
			Node rootNode = parseAST(rule.getRuleAst());
			if (rootNode.evaluate(attributes))
				return true; // Satisfies one rule
		}
		return false;
	}

	private Node parseAST(String ruleAstJson) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(ruleAstJson, Node.class);
	}
}
