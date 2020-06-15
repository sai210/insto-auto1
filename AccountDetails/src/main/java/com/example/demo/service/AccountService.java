package com.example.demo.service;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;

public interface AccountService {
 
	
	public Set<AccountEntity> getAllAccountDetails() throws ParseException ;
	public List<TransactionEntity> getByAccountNumber(Integer AccountNumber) throws ParseException;
	
	
}
