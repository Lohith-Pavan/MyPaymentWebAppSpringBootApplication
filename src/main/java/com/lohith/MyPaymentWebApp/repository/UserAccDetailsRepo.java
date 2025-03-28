package com.lohith.MyPaymentWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohith.MyPaymentWebApp.entity.UserAccountDetailsEntity;

@Repository
public interface UserAccDetailsRepo extends JpaRepository <UserAccountDetailsEntity,Integer>{
	
}
