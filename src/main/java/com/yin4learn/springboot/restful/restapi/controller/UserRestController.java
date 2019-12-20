package com.yin4learn.springboot.restful.restapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")// http://localhost:8080/user
public class UserRestController {

	@GetMapping("/getUser")
	public String getUser() {
		return "get function!";
	}
	
	@PostMapping("/createUser")
	public String createUser() {
		return "post function";
	}
	
	@PutMapping("/updateUser")
	public String updateUser() {
		return "put function";
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser() {
		return "delete function";
	}
}
