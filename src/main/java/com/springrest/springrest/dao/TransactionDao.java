package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction, Long> {
}
