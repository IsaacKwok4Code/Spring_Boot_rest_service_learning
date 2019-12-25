package com.yin4learn.springboot.restful.restapi.service;

import java.util.List;

import com.yin4learn.springboot.restful.restapi.dto.UserDTO;

public interface UserService {

	UserDTO createUser(UserDTO user);
	UserDTO getUser(String email);
	UserDTO getUserByUserId(String userId);
	UserDTO updateUser(String userId, UserDTO user);
	void deleteUser(String userId);
	List<UserDTO> getUsers(int page, int limit);
	boolean verifyEmailToken(String token);
	boolean requestPasswordReset(String email);
	boolean resetPassword(String token, String password);
}
