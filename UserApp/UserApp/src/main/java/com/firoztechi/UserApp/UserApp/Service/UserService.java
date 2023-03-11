package com.firoztechi.UserApp.UserApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.firoztechi.UserApp.UserApp.Entity.Department;
import com.firoztechi.UserApp.UserApp.Entity.ResponseTemplate;
import com.firoztechi.UserApp.UserApp.Entity.UserDetail;
import com.firoztechi.UserApp.UserApp.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private  RestTemplate restTemplate;
	@Autowired
	private UserRepository userRepository;
	@Value("${baseurl}")
	private String url;
	
	public UserDetail saveUser(UserDetail user) {
		return userRepository.save(user);
	}
	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate obj=new ResponseTemplate();
		UserDetail user=userRepository.findById(userId).get();
		Department department=restTemplate.getForObject(url+"/"+user.getUserId(), Department.class);
		obj.setUser(user);
		obj.setDepartments(department);
		return obj;
	}
}
