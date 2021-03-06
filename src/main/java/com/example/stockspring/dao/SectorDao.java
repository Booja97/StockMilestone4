package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.*;

public interface SectorDao extends JpaRepository<Sector, Integer>
{
	Sector findBySectorName(String sectorName);
}
