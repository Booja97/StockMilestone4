package com.example.stockspring.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer>{
      List<StockPrice> findByCompanyCode(int companyCode);
      
  	@Query("Select s.currentPrice from StockPrice s where s.companyCode= :companyCode and s.date between :fromDate and :toDate ")
  	public List<Double> getStockPrice(@Param("companyCode") int companyCode,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate); 
   
  	
}
