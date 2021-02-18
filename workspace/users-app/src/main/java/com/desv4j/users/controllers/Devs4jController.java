package com.desv4j.users.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Devs4jController {

	public String helloWorld() {
		return "";
	}
}
