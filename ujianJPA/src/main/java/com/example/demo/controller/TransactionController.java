package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/addTransaction")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}
	
	@PostMapping("/addTransactions")
	public List<Transaction> addTransactions(@RequestBody List<Transaction> transaction){
		return transactionService.saveTransactions(transaction);
	}
	
	@GetMapping("/getByTypeR")
	public List<Transaction> getTransactionByType() {
		return transactionService.getByType();
	}
	
	@GetMapping("/getByTypeS")
	public List<Transaction> getTransactionByTypeS() {
		return transactionService.getBytypeS();
	}
}
