package com.stockexchange.service;

import java.util.List;
import java.util.Optional;

import com.stockexchange.model.CompanyStocks;

public interface StockServices {
  List<CompanyStocks> getAllStocks();
  void saveCompanystocks(CompanyStocks companystocks);
  void deleteCompany(int companyID);
  Optional<CompanyStocks> getCompanySharesByID(int companyID);
  public int findlastid();
      
 
  }

