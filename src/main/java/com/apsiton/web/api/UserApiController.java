package com.apsiton.web.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.apsiton.web.httpclient.HTTPClientService;
import com.apsiton.web.vo.UserVO;

@EnableWebMvc
@RestController
@RequestMapping("/user")
public class UserApiController extends BaseController {

	protected final Log logger = LogFactory.getLog(UserApiController.class);

	@Autowired
	private HTTPClientService userService;

	@RequestMapping(value = "/v1/add", method = RequestMethod.POST)
	public UserVO addUser(@RequestBody UserVO user) {
		return userService.add(user);
	}

	@RequestMapping(value = "/v1/get", method = RequestMethod.GET)
	public UserVO getUser(@RequestParam(value = "id",required = false,
            defaultValue = "0") Integer id, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.getUserById(id);
	}

	@RequestMapping(value = "/v1/getall", method = RequestMethod.GET)
	public List<UserVO> getAllUsers(HttpServletRequest request,
			HttpServletResponse response) {
		return userService.getAllUsers();
	}

	
	@RequestMapping(value = "/v1/update", method = RequestMethod.POST)
	public UserVO updateUser(@RequestBody UserVO user, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.update(user);
	}

	@RequestMapping(value = "/v1/delete", method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody UserVO user, HttpServletRequest request,
			HttpServletResponse response) {
		userService.deleteUser(user);
	}

}
