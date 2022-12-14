package com.stockexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stockexchange.model.CompanyStocks;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyStocks, Integer>{

	@Query(value="select max(Company_ID) from company_stocks", nativeQuery = true)
	public int findlastid();
      
}
