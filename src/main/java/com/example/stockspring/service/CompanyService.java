package com.example.stockspring.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IpoPlanned;
import com.example.stockspring.model.StockPrice;

public interface CompanyService {
	public Company insertCompany(Company company) throws Exception;

	public Company updateCompany(Company company) throws Exception;

	public List<Company> getCompanyList() throws Exception;

	public List<Company> getCompanyListSector(String stockName)throws Exception;
    
	public List<Company> getMatchingList(String name) throws Exception;

	


	
}

