package com.example.ast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ast.entity.Rule;

public interface RuleRepository extends JpaRepository<Rule, Integer> {

}
