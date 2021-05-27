package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Details;
import com.example.demo.repository.Repositorydb;
@RestController
public class EntryController {
    @Autowired
	public Repositorydb repo;
    
    @PostMapping("/add")
	public String addDetails(@RequestBody Details details) {
    	Details customer = repo.save(details);
    	
    	 return "Thankyou" + details.getFullname();
    }
}
