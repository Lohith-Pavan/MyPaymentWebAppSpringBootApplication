package com.lohith.MyPaymentWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lohith.MyPaymentWebApp.entity.UserEntity;
import com.lohith.MyPaymentWebApp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepo;
	public List<UserEntity> getAllUserDetails(){
		return userRepo.findAll();
	}

}
