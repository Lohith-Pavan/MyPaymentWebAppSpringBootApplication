package com.lohith.MyPaymentWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohith.MyPaymentWebApp.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity,Integer>{
	
}
