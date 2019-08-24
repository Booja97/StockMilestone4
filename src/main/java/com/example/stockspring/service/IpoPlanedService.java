package com.example.stockspring.service;


import java.util.List;

import com.example.stockspring.model.IpoPlanned;



public interface IpoPlanedService {
      public List<IpoPlanned> getIpoPlanedList(String companyName) throws Exception;
}
