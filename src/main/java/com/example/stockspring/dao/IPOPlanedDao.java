package com.example.stockspring.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.IpoPlanned;



public interface IPOPlanedDao extends JpaRepository<IpoPlanned, Integer>{
     List<IpoPlanned> findByCompanyCode(int companyCode) ;
	   
}
