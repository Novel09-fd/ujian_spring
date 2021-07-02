package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addCompany")
	public Company addCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@PostMapping("/addCompanys")
	public List<Company> addProducts(@RequestBody List<Company> products){
		return companyService.saveCompanys(products);
	}
	
	@GetMapping("/getByAddress/{address}")
	public Company findByAddress (@PathVariable String address) {
		return companyService.getCompanyByAddress(address);
	}
}
