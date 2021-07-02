package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public List<Company> saveCompanys(List<Company> company){
		return companyRepository.saveAll(company);
	}
	
	public Company getCompanyByAddress (String address) {
		return companyRepository.findByAddress(address);
	}
	
}
