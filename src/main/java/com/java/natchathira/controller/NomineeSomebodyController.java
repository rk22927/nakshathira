package com.java.natchathira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.natchathira.entity.NomineeSomebody;
import com.java.natchathira.service.NomineeSomebodyService;

@RestController
@RequestMapping("/api/v1/somebody")
public class NomineeSomebodyController {

	@Autowired
	NomineeSomebodyService somebodyService;
	
	
	@PostMapping("/save")
	public Object save(@RequestBody NomineeSomebody nomineeSomebody) {
		return somebodyService.save(nomineeSomebody);
	}
}
