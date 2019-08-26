package com.example.expenses.DTO;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="expense")
public class Expense {

	public String getExpensetype() {
		return expensetype;
	}
	public void setExpensetype(String expensetype) {
		this.expensetype = expensetype;
	}
	public BigInteger getAmount() {
		return amount;
	}
	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}
	String expensetype;
	BigInteger amount;
	@Id
	String expenseId;
	public String getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}
	
	
}
