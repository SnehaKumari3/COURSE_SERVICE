package com.springrest.springrest.services.Transaction;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.entities.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> getTransaction();
//    public Transaction getTransaction(long transactionId);

    public List<Transaction> addTransaction(Transaction transaction);
//    public List<Transaction> updateTransaction(Transaction transaction);
//    public List<Transaction> deleteTransaction(long transactionId);
}
