package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	@Query(value = "Select * from transaction where type = 'r' ",nativeQuery = true)
	List<Transaction> fintTypeR ();
	
	@Query(value = "Select * from transaction where type = 's' ",nativeQuery = true)
	List<Transaction> fintTypeS ();
}
