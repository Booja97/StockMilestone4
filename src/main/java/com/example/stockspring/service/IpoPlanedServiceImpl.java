package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.IpoPlanned;
import com.example.stockspring.dao.*;



@Service
public class IpoPlanedServiceImpl implements IpoPlanedService{
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private IPOPlanedDao  ipoPlanedDao;
	
	@Override
	public List<IpoPlanned> getIpoPlanedList(String companyName) throws Exception {
		Company company = companyDao.findByCompanyName(companyName);
		return ipoPlanedDao.findByCompanyCode(company.getCompanyCode());
	}

}
