package com.yin4learn.springboot.restful.restapi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -4323854291226848914L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(nullable=false, name="user_id")
	private String userId;
	
	@Column(nullable=false, length=50, name="first_name")
	private String firstName;
	
	@Column(nullable=false, length=50, name="last_name")
	private String lastName;
	
	@Column(nullable=false, length=120, unique=true, name="email")
	private String email;
	
	@Column(nullable=false, name="encrypted_password")
	private String encryptedPassword;
	
	@Column(name="email_token")
	private String emailVerificationToken;
	
	@Column(nullable=true, name="email_verification_status")
	private boolean emailVerificationStatus = false;
	
	@OneToMany(mappedBy="userDetails", cascade=CascadeType.ALL)
	private List<AddressEntity> addresses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}

	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	
}
