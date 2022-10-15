package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Service.employeeService;

@RestController
@RequestMapping("/order")
public class employeecontroller {
	@Autowired
	private employeeService empservice;
}
