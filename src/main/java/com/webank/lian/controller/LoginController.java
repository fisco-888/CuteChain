package com.webank.lian.controller;

import com.webank.lian.service.UserService;
import com.webank.lian.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login")
	public String login() {
		return "page-login";
	}
	
	@RequestMapping(value = "/person_do_login")
	@ResponseBody
	public Result<Long> personDoLogin(@RequestParam String identification,
	                                  @RequestParam String password) {
		return userService.login(identification, password);
	}
	
	@RequestMapping(value = "/com_do_login")
	@ResponseBody
	public Result<Long> comDoLogin(@RequestParam String name,
	                               @RequestParam String password) {
		return userService.login(name, password);
	}
	
}
