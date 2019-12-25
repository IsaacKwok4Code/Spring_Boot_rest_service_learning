package com.yin4learn.springboot.restful.restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yin4learn.springboot.restful.restapi.entity.AddressEntity;
import com.yin4learn.springboot.restful.restapi.entity.UserEntity;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

	List<AddressEntity> findAllByUserDetails(UserEntity userEntity);
	AddressEntity findByAddressId(String addressId);
}
