package com.yin4learn.springboot.restful.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yin4learn.springboot.restful.restapi.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
	UserEntity findUserByEmailVerificationToken(String token); 
}
