package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Transaction;
import com.springrest.springrest.services.Transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;


    @GetMapping("/transaction")
    public List<Transaction> getTransactions(){
        return this.transactionService.getTransaction();
    }

    @PostMapping(path="/transaction", consumes="application/json")
    public List<Transaction> addTransaction(@RequestBody Transaction transaction){
        return this.transactionService.addTransaction(transaction);
    }

}
