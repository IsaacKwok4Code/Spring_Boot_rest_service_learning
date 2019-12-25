package com.yin4learn.springboot.restful.restapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="addresses")
public class AddressEntity implements Serializable {

	private static final long serialVersionUID = -199510023425684018L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(length=30, nullable=false, name="address_id")
	private String addressId;
	
	@Column(length=15, nullable=false, name="city")
	private String city;
	
	@Column(length=15, nullable=false, name="country")
	private String country;
	
	@Column(length=100, nullable=false, name="street_name")
	private String streetName;
	
	@Column(length=7, nullable=false, name="postal_code")
	private String postalCode;
	
	@Column(length=10, nullable=false, name="type")
	private String type;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	private UserEntity userDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserEntity getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserEntity userDetails) {
		this.userDetails = userDetails;
	}
	
	
}
