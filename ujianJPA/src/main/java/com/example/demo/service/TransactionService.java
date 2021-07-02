package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	public List<Transaction> saveTransactions(List<Transaction> transaction){
		return transactionRepository.saveAll(transaction);
	}
	
	public List<Transaction>getByType () {
		return transactionRepository.fintTypeR();
	}
	
	public List<Transaction> getBytypeS () {
		return transactionRepository.fintTypeS();
	}
}
