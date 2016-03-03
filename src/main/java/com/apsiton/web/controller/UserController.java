package com.apsiton.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value = {"/listusers" }, produces = MediaType.TEXT_HTML_VALUE)
	public String listUser() {
		return "list_users";
	}
	
	@RequestMapping(value = {"/userform" }, produces = MediaType.TEXT_HTML_VALUE)
	public String createEditUser() {
		return "create_edit_user";
	}
}
