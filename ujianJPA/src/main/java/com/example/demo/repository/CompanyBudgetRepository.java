package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CompanyBudget;

public interface CompanyBudgetRepository extends JpaRepository<CompanyBudget, Integer> {

	
	@Query(value = "Select * \n"
			+ "FROM budget \n"
			+ "WHERE budget_amount < 0", nativeQuery = true)
	List<CompanyBudget> findAmountMinus();
	

		@Query(value = "Select * \n"
				+ "FROM budget \n"
				+ "WHERE budget_amount > ?1", nativeQuery = true)
		List<CompanyBudget> findAmountPlus(int amount);
}
