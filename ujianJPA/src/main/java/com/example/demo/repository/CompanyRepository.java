package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

	
	@Query(value = "Select * from company where company.address like %:address%",nativeQuery = true)
	Company findByAddress (String address);
}
