package com.lohith.MyPaymentWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohith.MyPaymentWebApp.entity.BankAccountsEntity;

@Repository
public interface BankAccountsRepo extends JpaRepository <BankAccountsEntity,Integer>{

}
