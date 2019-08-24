 package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
import com.example.stockspring.service.CompanyService;

@RestController
public class SectorRestController {
      @Autowired
      CompanyService companyService;
    
      @Autowired
      CompanyDao companyDao;
      
      @Autowired
      SectorDao sectorDao;
	
	  @GetMapping("/companyList/{name}")
      public List<Company> getCompanyList(@PathVariable("name") String sectorName) throws Exception
      {
		  return companyService.getCompanyListSector(sectorName);
      }
	
	  @GetMapping("/matchingCompanyList/{name}")
	  public List<Company> getMatchingList(@PathVariable("name") String name) throws Exception
	  {
		  return companyService.getMatchingList(name);
	  }
	  
	  @GetMapping("/sectorList/{name}")
	  public Sector getSectorList(@PathVariable("name") String sectorName) throws Exception
	  {
		  return sectorDao.findBySectorName(sectorName);
	  }
	 
	  @GetMapping("/sectorList")
	  public List<Sector> getSectorList() throws Exception
	  {
		  return sectorDao.findAll();
	  }
}