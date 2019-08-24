package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.*;


public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>
{
	 List<StockExchange> findBystockExchangeName(String stockExchangeName);
}
