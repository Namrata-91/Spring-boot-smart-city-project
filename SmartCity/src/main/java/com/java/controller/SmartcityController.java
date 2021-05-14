package com.java.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.model.SubmitedData;
import com.java.repository.SubmitRepository;


@Controller
public class SmartcityController {

	@Autowired
	private SubmitRepository submitRepository;
	@GetMapping("/")
	public String firstPage() {
		return "index";
	}
	//save data
	  @PostMapping("/") 
	  public String addCustomer(@ModelAttribute("submitedData") SubmitedData submitedData) {
	  submitRepository.save(submitedData);
	  return ("redirect:/"); }
}
