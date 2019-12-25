package com.yin4learn.springboot.restful.restapi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.yin4learn.springboot.restful.restapi.dto.UserDTO;
import com.yin4learn.springboot.restful.restapi.entity.UserEntity;
import com.yin4learn.springboot.restful.restapi.repository.UserRepository;
import com.yin4learn.springboot.restful.restapi.util.Utils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils util;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDTO createUser(UserDTO user) {
		
		UserEntity existingUserDetails = userRepository.findByEmail(user.getEmail());
		if(existingUserDetails != null) throw new RuntimeException("Record is existing");
		
		
		UserEntity userEntity = new UserEntity(); //create entity object
		UserDTO returnObject = new UserDTO(); //create return object
		
		BeanUtils.copyProperties(user, userEntity);	//copy Rq data to entity object
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		String publicUserId = util.generateUserId(30);
		userEntity.setUserId(publicUserId);
		UserEntity storedUserDetails = userRepository.save(userEntity); //save call
		BeanUtils.copyProperties(storedUserDetails, returnObject);	//copy storedData to return object
		return null;
	}

	@Override
	public UserDTO getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(String userId, UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserDTO> getUsers(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyEmailToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestPasswordReset(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetPassword(String token, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
