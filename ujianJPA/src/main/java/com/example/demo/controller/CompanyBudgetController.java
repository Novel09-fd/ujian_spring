package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.CompanyBudget;
import com.example.demo.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {

	@Autowired
	private CompanyBudgetService companyBudgetService;
	
	@PostMapping("/addCompanyBudget")
	public CompanyBudget addCompanyBudget(@RequestBody CompanyBudget companyBudget) {
		return companyBudgetService.saveCompanyBudget(companyBudget);
	}
	
	@PostMapping("/addCompanyBudgets")
	public List<CompanyBudget> addCompanyBudgets(@RequestBody List<CompanyBudget> companyBudgets){
		return companyBudgetService.saveCompanyBudgets(companyBudgets);
	}
	
	@GetMapping("/getMinusAmount")
	public List<CompanyBudget> getAmountMinus() {
		return companyBudgetService.findAmountMinus();
	}
	
	@GetMapping("/getPlusAmount/{amount}")
	public List<CompanyBudget> getAmountPlus(@PathVariable int amount) {
		return companyBudgetService.findAmountPlus(amount);
	}
}
