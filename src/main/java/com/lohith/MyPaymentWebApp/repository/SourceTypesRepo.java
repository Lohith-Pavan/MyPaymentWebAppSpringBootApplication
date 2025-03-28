package com.lohith.MyPaymentWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohith.MyPaymentWebApp.entity.SourceTypesEntity;

@Repository
public interface SourceTypesRepo extends JpaRepository <SourceTypesEntity,Integer>{
	
}
