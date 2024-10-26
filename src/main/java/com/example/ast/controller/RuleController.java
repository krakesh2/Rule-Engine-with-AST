package com.example.ast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ast.dto.RuleDto;
import com.example.ast.entity.UserAttributes;
import com.example.ast.service.RuleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RequestMapping("/api/rules")
@Controller
//@RestController
public class RuleController {

	@Autowired
	private RuleService ruleService;

	@GetMapping("/create")
	public String create() {
		return "createRule";
	}

	@GetMapping("/evaluateform")
	public String evaluate() {
		return "evaluate";
	}

	@PostMapping("/create")
	public String createRule(RuleDto ruleDTO) {
		ruleService.createRule(ruleDTO);
		return "evaluate";
	}

	@PostMapping("/evaluate")
	public String evaluateUser(UserAttributes attributes)
			throws JsonMappingException, JsonProcessingException {
		boolean result = ruleService.evaluateUser(attributes);
		if (result==false) {
			return "welcome";
		} else {
			return "error";
		}
	}
}
