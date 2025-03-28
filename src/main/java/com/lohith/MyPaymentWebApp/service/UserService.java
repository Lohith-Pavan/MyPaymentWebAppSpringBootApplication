package com.lohith.MyPaymentWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lohith.MyPaymentWebApp.entity.BankAccountsEntity;
import com.lohith.MyPaymentWebApp.entity.SourceTypesEntity;
import com.lohith.MyPaymentWebApp.entity.TransactionsEntity;
import com.lohith.MyPaymentWebApp.entity.UserAccountDetailsEntity;
import com.lohith.MyPaymentWebApp.entity.UserEntity;
import com.lohith.MyPaymentWebApp.repository.BankAccountsRepo;
import com.lohith.MyPaymentWebApp.repository.SourceTypesRepo;
import com.lohith.MyPaymentWebApp.repository.TransactionsRepo;
import com.lohith.MyPaymentWebApp.repository.UserAccDetailsRepo;
import com.lohith.MyPaymentWebApp.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	public UserRepository userRepo;
	public List<UserEntity> getAllUserDetails(){
		return userRepo.findAll();
	}
	@Autowired
	public UserAccDetailsRepo userAccDetailsRepo; 
	public List<UserAccountDetailsEntity> getAllUserAccDetails(){
		return userAccDetailsRepo.findAll();
	}
	@Autowired
	public BankAccountsRepo bankAccountsRepo;
	public List<BankAccountsEntity> getAllBankAccounts(){
		return bankAccountsRepo.findAll();
	}
	@Autowired
	public SourceTypesRepo sourceTypesRepo;
	public List<SourceTypesEntity> getAllSourceTypes(){
		return sourceTypesRepo.findAll();
	}
	@Autowired
	public TransactionsRepo transactionsRepo;
	public List<TransactionsEntity> getAllTransactions(){
		return transactionsRepo.findAll();
	}
}
