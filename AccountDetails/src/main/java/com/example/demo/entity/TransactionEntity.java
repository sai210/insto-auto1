package com.example.demo.entity;

import java.util.Date;

public class TransactionEntity {

	
	private Integer accountNumber;
	private String  accountName;
	private String  valuedate;
	private String currency;
	private String debitAmount;
	private double creditAmount;
	private String debitOrCredit;
	private String transactionNarrative;
	public TransactionEntity(Integer accountNumber, String accountName, String valuedate, String currency,
			String debitAmount, double creditAmount, String debitOrCredit, String transactionNarrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valuedate = valuedate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.debitOrCredit = debitOrCredit;
		this.transactionNarrative = transactionNarrative;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getValuedate() {
		return valuedate;
	}
	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDebitOrCredit() {
		return debitOrCredit;
	}
	public void setDebitOrCredit(String debitOrCredit) {
		this.debitOrCredit = debitOrCredit;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	@Override
	public String toString() {
		return "TransactionEntity [accountNumber=" + accountNumber + ", accountName=" + accountName + ", valuedate="
				+ valuedate + ", currency=" + currency + ", debitAmount=" + debitAmount + ", creditAmount="
				+ creditAmount + ", debitOrCredit=" + debitOrCredit + ", transactionNarrative=" + transactionNarrative
				+ "]";
	}
	
	
	
	
	
}