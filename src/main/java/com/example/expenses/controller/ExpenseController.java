package com.example.expenses.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenses.DTO.Expense;
import com.example.expenses.Repository.ExpensesRepository;

@RestController
@RequestMapping("/")
public class ExpenseController {
	@Autowired
	private final ExpensesRepository expensesRepository;
	public ExpenseController(ExpensesRepository expensesRepository) {
		this.expensesRepository = expensesRepository;
	}
	
	@RequestMapping(value="getExpense")
	@ResponseBody
	public ResponseEntity<List> getExpenses(){
		Integer expense=677;
		System.out.println("entered into controller-----------");
		List<Expense> li=expensesRepository.findAll();
		
		return new ResponseEntity<List>(li,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="addExpense")
	@ResponseBody
	public ResponseEntity<String> addExpenses(@RequestParam("expenseName") String expenseType, @RequestParam("amount") BigInteger amount){
		
		System.out.println("entered into controller-----------"+expenseType+"----"+amount);
		Expense expense=new Expense();
		expense.setExpensetype(expenseType);
		expense.setAmount(amount);
		expense.setExpenseId(UUID.randomUUID().toString());
		
		expensesRepository.save(expense);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
}
