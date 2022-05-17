package com.weshopify.platform.features.customers;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.weshopify.platform.features.customers.commons.PasswordValidator;

public class CustomerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3392255258797133035L;
	
	private int customerId;
	private boolean selfReg;
	
	@NotEmpty(message = "First Name must be Provided, It shouldnt be empty")
	private String firstName;
	
	@NotEmpty(message = "Last Name must be Provided, It shouldnt be empty")
	private String lastName;
	
	@NotEmpty(message = "User Name must be Provided, It shouldnt be empty")
	private String userName;
	
	@NotEmpty(message = "Email must be Provided, It shouldnt be empty")
	@Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
	private String email;
	
	@NotEmpty(message = "Password Must be Provided, It shouldnt be empty")
	@PasswordValidator(message = "Password should be 8 characters Length with the "
			+ "One Letter must be Capital and One Number Should Present")
	private String password;
	
	//@Digits(integer = 10,fraction = 2,message = "Mobile Number should be of 10 digits")
	//@Max(value = 10,message = "Mobile Number should be of minimum 10 digits")
	//@Max(value = 14,message = "Mobile Number should be of maximum 14 digits")
	@Pattern(regexp = "^([+]\\d{2})?\\d{10}$",message = "Mobile Number should be of minimum 10 digits")
	private String mobileNumber;
	
	public boolean isSelfReg() {
		return selfReg;
	}
	public void setSelfReg(boolean selfReg) {
		this.selfReg = selfReg;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerBean other = (CustomerBean) obj;
		if (customerId != other.customerId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", email=" + email + ", password=" + password + ", mobileNumber="
				+ mobileNumber + "]";
	}


}
