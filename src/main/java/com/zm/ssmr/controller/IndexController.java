package com.zm.ssmr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zm.ssmr.bean.User;
import com.zm.ssmr.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> getAll() {
		List<User> all = service.getAll();
		return all;
	}
}
