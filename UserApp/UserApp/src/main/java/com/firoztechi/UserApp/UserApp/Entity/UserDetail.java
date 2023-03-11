package com.firoztechi.UserApp.UserApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String userName;
	private String userAddress;
	private String userDepartmentId;
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserDepartmentId() {
		return userDepartmentId;
	}
	public void setUserDepartmentId(String userDepartmentId) {
		this.userDepartmentId = userDepartmentId;
	}
 
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UserDetail() {
		
	}
	public UserDetail(long userId, String userName, String userAddress, String userDepartmentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userDepartmentId = userDepartmentId;
	}
	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress
				+ ", userDepartmentId=" + userDepartmentId + "]";
	}
 
	

}
