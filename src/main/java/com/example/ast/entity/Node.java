package com.example.ast.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
	private String type;
	private Node left;
	private Node right;
	private String operator;
	private String field;
	private String comparator;
	private Object value;

	// Evaluation method
	public boolean evaluate(UserAttributes attributes) {
		if (type.equals("operator")) {
			boolean leftResult = left.evaluate(attributes);
			boolean rightResult = right.evaluate(attributes);
			if (operator.equals("AND"))
				return leftResult && rightResult;
			return leftResult || rightResult;
		} else if (type.equals("operand")) {
			Object userValue = attributes.getFieldValue(field);
			return evaluateCondition(userValue, comparator, value);
		}
		return false;
	}

	private boolean evaluateCondition(Object userValue, String comparator, Object value) {
		if (comparator.equals(">"))
			return ((Comparable) userValue).compareTo(value) > 0;
		if (comparator.equals("<"))
			return ((Comparable) userValue).compareTo(value) < 0;
		if (comparator.equals("=="))
			return userValue.equals(value);
		return false;
	}
}
