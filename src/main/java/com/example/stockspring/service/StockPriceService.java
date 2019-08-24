package com.example.stockspring.service;
import java.sql.Date;
import java.util.List;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;



public interface StockPriceService {
	public List<StockPrice> getStockPriceCompany(String companyName);
  
	
		
}
