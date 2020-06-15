package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
    
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/getAllAccountDetails")
	public Set<AccountEntity> getAllAccountDetails() throws ParseException{
		return accountService.getAllAccountDetails();
	}
	
	@GetMapping(value="/getByAccountNumber/{AccountNumber}")
	public List<TransactionEntity> getByAccountNumber(@PathVariable("AccountNumber")Integer AccountNumber) throws ParseException {
		return accountService.getByAccountNumber(AccountNumber);
	}
}
