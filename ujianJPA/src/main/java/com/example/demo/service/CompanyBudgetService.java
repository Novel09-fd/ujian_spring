package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.CompanyBudget;
import com.example.demo.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {

	@Autowired
	private CompanyBudgetRepository companyBudgetRepository;
	
	public CompanyBudget saveCompanyBudget(CompanyBudget companyBudget) {
		return companyBudgetRepository.save(companyBudget);
	}
	
	public List<CompanyBudget> saveCompanyBudgets(List<CompanyBudget> companyBudget){
		return companyBudgetRepository.saveAll(companyBudget);
	}
	
	
	public List<CompanyBudget> findAmountMinus(){
		return companyBudgetRepository.findAmountMinus();
	}
	
	public List<CompanyBudget> findAmountPlus(int amount) {
		return companyBudgetRepository.findAmountPlus(amount);
	}
}
