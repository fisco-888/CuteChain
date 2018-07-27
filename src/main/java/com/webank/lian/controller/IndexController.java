package com.webank.lian.controller;

import com.webank.lian.domain.User;
import com.webank.lian.service.UserService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user/{userId}")
	public String userIndex(@PathVariable(name = "userId") Integer userId,
	                        Model model) {
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value = "/company/{companyId}")
	public String comIndex(@PathVariable(name = "userId") Integer userId,
	                       Model model) {
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "index";
	}
}
