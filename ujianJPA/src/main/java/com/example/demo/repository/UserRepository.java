package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);
	
	@Query(value = "Select id , company_id , email , instagram , name from user where user.name like %:name%",nativeQuery = true)
	User findByFirstName (String name);
	
	@Query (value = "Select * from user where user.company_id like %:company_id%",nativeQuery = true)
	User findByCompanyId (String company_id);
}
