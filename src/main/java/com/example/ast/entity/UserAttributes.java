package com.example.ast.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAttributes {
	private int age;
	private String department;
	private double salary;
	private int experience;


	public Object getFieldValue(String fieldName) {
		switch (fieldName) {
		case "age":
			return age;
		case "department":
			return department;
		case "salary":
			return salary;
		case "experience":
			return experience;
		default:
			return null;
		}
	}
}
