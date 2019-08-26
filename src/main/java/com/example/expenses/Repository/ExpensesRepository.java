package com.example.expenses.Repository;

import org.springframework.stereotype.Repository;

import com.example.expenses.DTO.Expense;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ExpensesRepository extends MongoRepository<Expense, String> {

	

}
