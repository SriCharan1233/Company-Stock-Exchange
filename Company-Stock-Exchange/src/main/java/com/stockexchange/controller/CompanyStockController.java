package com.stockexchange.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stockexchange.model.CompanyStocks;
import com.stockexchange.service.StockServices;

@Controller
public class CompanyStockController {

	@Autowired
	private StockServices stockservices;

	@GetMapping("/start")
	public String viewHopePage(Model model) {
		model.addAttribute("CompanyList", stockservices.getAllStocks());
		return "Home";
	}

	@GetMapping("/NewCompanyForm")
	public String NewCompanyForm(Model model) {
		CompanyStocks companystocks = new CompanyStocks();
		model.addAttribute("Company", companystocks);
		model.addAttribute("Company_ID", stockservices.findlastid());
		return "AddCompany";

	}

	@PostMapping("/addingCompany")
	public String addcompany(@RequestParam("CompanyID") int CompanyID, @RequestParam("CompanyName") String CompanyName,
			@RequestParam("SharePrice") int SharePrice) {
		CompanyStocks companystocks = new CompanyStocks();
		companystocks.setCompany_ID(CompanyID);
		companystocks.setCompany_Name(CompanyName);
		companystocks.setStock_Price(SharePrice);
		stockservices.saveCompanystocks(companystocks);
		return "redirect:/start";

	}
	
	@GetMapping("/DeleteCompany")
	 public String deleteByID(@RequestParam int id) {
        
        stockservices.deleteCompany(id);
        return "redirect:/start";
	}
	@GetMapping("/UpdateSharePrice")
	 public String updateByID(@RequestParam int id, Model model) {
       Optional<CompanyStocks> companystocks = stockservices.getCompanySharesByID(id);
       CompanyStocks stocks = companystocks.get();
		model.addAttribute("CompanyID", stocks.getCompany_ID());
		model.addAttribute("CompanyName", stocks.getCompany_Name());
		model.addAttribute("SharePrice", stocks.getStock_Price());
       return "Update";
	}
	
}
