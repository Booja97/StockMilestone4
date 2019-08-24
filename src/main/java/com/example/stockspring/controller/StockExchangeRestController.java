package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.stockspring.dao.StockExchangeDao;
import com.example.stockspring.model.StockExchange;

@RestController
public class StockExchangeRestController {

	   @Autowired
	   StockExchangeDao stockExchangeDao;
	   
	   @GetMapping("/stockExchangeList/{name}")
		  public List<StockExchange> getSectorList(@PathVariable("name") String stockExchangeName) throws Exception
		  {
			  return stockExchangeDao.findBystockExchangeName(stockExchangeName);
		  }
	   

		 @GetMapping("/insertStockExchange/{name}/{address}/{brief}/{remarks}")
		 public  StockExchange insertStockExchange(@PathVariable("name") String stockExchangeName,@PathVariable("address") String address,@PathVariable("brief") String brief, @PathVariable("remarks") String remarks  ) 
	     {
			 StockExchange stock= new StockExchange(stockExchangeName,address,brief,remarks);
			
			 return  stockExchangeDao.save(stock);
	     }
		 
		 @GetMapping("/stockExchangeList")
		  public List<StockExchange> getSector() throws Exception
		  {
			  return stockExchangeDao.findAll();
		  }
	   
}
