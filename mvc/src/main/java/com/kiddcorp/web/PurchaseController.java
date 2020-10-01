package com.kiddcorp.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.kiddcorp.service.PurchaseService;

@Controller
public class PurchaseController {
	@Autowired
	private PurchaseService purchaseService;

	@GetMapping("/index.html")
	public String getIndex() {
		System.out.println("getIndex was called");
		return "/index";
	}
	
	@GetMapping("/") 
	public String getRoot() {
		return "redirect:/index.html";
	}
	
	@ModelAttribute("date")
	public Date getDate() {
		return new Date();
	}
	
	@GetMapping("/addEditPurchase") 
	public String showAddForm() {
		return "/addEditPurchase";
	}
	
}
