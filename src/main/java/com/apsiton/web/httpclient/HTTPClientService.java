package com.apsiton.web.httpclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apsiton.web.vo.UserVO;

@Service
public class HTTPClientService {

	@Autowired
	RestTemplate restTemplate;

	private String dataAccessURL = "http://192.168.1.135:8080/PMTBusiness";

	public void deleteUser(UserVO user) {
		restTemplate.delete(dataAccessURL + "/user/v1/delete", user);
	}

	public UserVO add(UserVO user) {
		return restTemplate.postForObject(dataAccessURL + "/user/v1/add", user,
				UserVO.class);
	}

	public UserVO update(UserVO user) {
		return restTemplate.postForObject(dataAccessURL + "/user/v1/upate",
				user, UserVO.class);
	}

	public UserVO getUserById(Integer userId) {
		return restTemplate.getForObject(dataAccessURL + "/user/v1/get?id="
				+ userId, UserVO.class);
	}
	
	public List<UserVO> getAllUsers() {
		return restTemplate.getForObject(dataAccessURL + "/user/v1/getall", List.class);
	}
}
