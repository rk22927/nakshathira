package com.java.natchathira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.natchathira.entity.NomineeMySelf;
import com.java.natchathira.service.NomineeMySelfService;

@RestController
@RequestMapping("/api/v1/myself")
public class NomineeMySelfController {

	@Autowired
	NomineeMySelfService mySelfService;

	@PostMapping("/save")
	public Object save(@RequestBody NomineeMySelf nomineeMySelf) {
		return mySelfService.save(nomineeMySelf);
	}
}
