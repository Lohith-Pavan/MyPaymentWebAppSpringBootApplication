package com.lohith.MyPaymentWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohith.MyPaymentWebApp.entity.TransactionsEntity;

@Repository
public interface TransactionsRepo extends JpaRepository <TransactionsEntity,Integer>{

}
