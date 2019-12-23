package com.yin4learn.springboot.restful.restapi.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yin4learn.springboot.restful.restapi.dto.UserDTO;
import com.yin4learn.springboot.restful.restapi.model.UserDetailsRequest;
import com.yin4learn.springboot.restful.restapi.model.UserDetailsResponse;
import com.yin4learn.springboot.restful.restapi.service.UserService;

@RestController
@RequestMapping("user")// http://localhost:8080/user
public class UserRestController {
	
	@Autowired
	UserService userService;

	@GetMapping("/getUser")
	public String getUser() {
		return "get function!";
	}
	
	@PostMapping("/createUser")
	public UserDetailsResponse createUser(@RequestBody UserDetailsRequest userinfo) {
		UserDetailsResponse userinfoRs = new UserDetailsResponse();
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(userinfo, userDTO);
		UserDTO createdObj = userService.createUser(userDTO);
		BeanUtils.copyProperties(createdObj, userinfoRs);
		return userinfoRs;
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
