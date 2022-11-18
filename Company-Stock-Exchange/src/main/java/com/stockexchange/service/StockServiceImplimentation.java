package com.stockexchange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockexchange.model.CompanyStocks;
import com.stockexchange.repository.CompanyRepository;

@Service
public class StockServiceImplimentation implements StockServices {

	@Autowired
	private CompanyRepository companyrepository;

	@Override
	public List<CompanyStocks> getAllStocks() {
		// TODO Auto-generated method stub
		return companyrepository.findAll();
	}

	@Override
	public void saveCompanystocks(CompanyStocks companystocks) {
		// TODO Auto-generated method stub
		this.companyrepository.save(companystocks);

	}

	@Override
	public void deleteCompany(int id) {
		// TODO Auto-generated method stub
		companyrepository.deleteById(id);
	}

	@Override
	public Optional<CompanyStocks> getCompanySharesByID(int companyID) {
		// TODO Auto-generated method stub
		return companyrepository.findById(companyID);
	}
   public int findlastid() {
        
        return (companyrepository.findlastid()+1);
    }


}
