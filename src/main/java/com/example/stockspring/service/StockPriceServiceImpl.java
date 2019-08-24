package com.example.stockspring.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.*;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;


@Service
public class StockPriceServiceImpl implements StockPriceService{
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private StockPriceDao stockPriceDao;
	

	public List<StockPrice> getStockPriceCompany(String companyName) {
		Company company = companyDao.findByCompanyName(companyName);
		return stockPriceDao.findByCompanyCode(company.getCompanyCode());
	}

	
}
