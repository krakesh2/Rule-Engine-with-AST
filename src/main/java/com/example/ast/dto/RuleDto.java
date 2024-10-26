package com.example.ast.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RuleDto {
	private Integer id;
	private String ruleName;
	private String ruleAst;
}
