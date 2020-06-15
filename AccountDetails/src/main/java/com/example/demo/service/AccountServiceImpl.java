package com.example.demo.service;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.TransactionEntity;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
	private AccountDao accountDao;
	@Override
	public Set<AccountEntity> getAllAccountDetails() throws ParseException {
		
		return accountDao.getAllAccountDetails();
	}

	@Override
	public List<TransactionEntity> getByAccountNumber(Integer AccountNumber) throws ParseException {
		
		return accountDao.getByAccountNumber(AccountNumber);
	}

}
