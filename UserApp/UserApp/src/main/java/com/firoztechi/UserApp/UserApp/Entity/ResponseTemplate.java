package com.firoztechi.UserApp.UserApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
public class ResponseTemplate {
	private UserDetail user;
	private Department departments;
	public UserDetail getUser() {
		return user;
	}
	public void setUser(UserDetail user) {
		this.user = user;
	}
	public Department getDepartments() {
		return departments;
	}
	public void setDepartments(Department departments) {
		this.departments = departments;
	}

}
