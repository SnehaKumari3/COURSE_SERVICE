package com.springrest.springrest.services.Transaction;

import com.springrest.springrest.dao.TransactionDao;
import com.springrest.springrest.entities.Transaction;
import com.springrest.springrest.services.Transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionDao transactionDao;

    @Override
    public List<Transaction> getTransaction(){
        return transactionDao.findAll();
    }

    @Override
    public List<Transaction> addTransaction(Transaction transaction){
        transactionDao.save(transaction);
        return transactionDao.findAll();
    }
}
