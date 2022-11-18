package com.stockexchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyStocks {
    @Id
	private int company_ID;
	private String company_Name;
	@Column(length = 50)
	private double stock_Price;

	public int getCompany_ID() {
		return company_ID;
	}

	public void setCompany_ID(int company_ID) {
		this.company_ID = company_ID;
	}

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public double getStock_Price() {
		return stock_Price;
	}

	public void setStock_Price(double stock_Price) {
		this.stock_Price = stock_Price;
	}

	@Override
	public String toString() {
		return "CompanyStocks [company_ID=" + company_ID + ", company_Name=" + company_Name + ", stock_Price="
				+ stock_Price + "]";
	}

	public CompanyStocks() {
		super();
	}

}
