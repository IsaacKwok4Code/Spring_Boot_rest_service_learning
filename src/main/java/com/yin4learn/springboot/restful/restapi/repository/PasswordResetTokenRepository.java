package com.yin4learn.springboot.restful.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yin4learn.springboot.restful.restapi.entity.PasswordResetTokenEntity;

@Repository
public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long> {
	PasswordResetTokenEntity findByToken(String token);
}
