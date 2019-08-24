package com.example.stockspring.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;


@RestController
public class StockPriceController {

	 @Autowired
	 StockPriceDao stockPriceDao;
	 
	 @Autowired
	 SectorDao sectorDao;
	 
	 @Autowired
	 CompanyDao companyDao;
	 
	 @GetMapping("/sectors/price/{name}/{from_date}/{to_date}")
	 public Double getsectorpriceList(@PathVariable("name") String name,@PathVariable("from_date") Date from_date,@PathVariable("to_date") Date to_date)
	 {
	        Sector sectors=sectorDao.findBySectorName(name);
	        List<Double> stockprice=new ArrayList<Double>();
	        List<Company> companies =new ArrayList<>(); 
	        companyDao.findBySectorId(sectors.getSectorId()).forEach(companies::add);
	        int[] companyCode=new int[10];
	        Double total =0.0;
	        for(int i=0,k=0;i<companies.size();i++,k++)
	        {
	        companyCode[k]=companies.get(i).getCompanyCode();
	          stockPriceDao.getStockPrice(companyCode[k], from_date, to_date).forEach(stockprice::add);
	        }
	        for(int j=0;j<stockprice.size();j++)
	        {
	               total=total+stockprice.get(j);
	        }
	        return total;
	 }

	 @GetMapping("/stockPriceDate/{name}/{fromDate}/{toDate}")
	  public List<Double> getStockPriceDate(@PathVariable("name") String name,@PathVariable("fromDate") Date fromDate,@PathVariable("toDate") Date toDate) throws Exception
	  {
		  Company company=  companyDao.findByCompanyName(name);
		  int companyCode=  company.getCompanyCode();
		  List<Double> stockprice = stockPriceDao.getStockPrice(companyCode,fromDate,toDate);
		  return stockprice;
	  }
}
