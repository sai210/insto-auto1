package com.example.demo.dao;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.utility.AccountUtility;
@Repository
public class AccountDaoImpl implements AccountDao {
   @Autowired
	private AccountUtility accountUtility;
	@Override
	public Set<AccountEntity> getAllAccountDetails() throws ParseException {
	      return accountUtility.getAllAccountDetails();
	}
   
	@Override
	public List<TransactionEntity> getByAccountNumber(Integer accountNumber) throws ParseException {
		return accountUtility.getByAccountNumber(accountNumber);
	}}
