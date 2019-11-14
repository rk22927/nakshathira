package com.java.natchathira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.natchathira.dto.UserDto;
import com.java.natchathira.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/get/{id}")
	public Object get(@PathVariable Long id) {
		return userService.get(id);
	}
	
	@GetMapping("/getAll")
	public Object getAll() {
		return userService.getAll();
	}
	
	@PostMapping("/save")
	public Object save(@RequestBody UserDto userDto) {
		return userService.save(userDto);
	}
	
	@PutMapping("/update")
	public Object update(@RequestBody UserDto userDto) {
		return userService.update(userDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public Object delete(@PathVariable Long id) {
		return userService.delete(id);
	}
}
