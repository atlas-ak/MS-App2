package com.sample.boot2.MicroService2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsController2 {

	@RequestMapping(value="/")
	public String getDefaultMessage() {
		return "Login Successful ";
	}
	@RequestMapping(value="/{name}")
	public String getMessage(@PathVariable("name") String customerName) {
		return "Welcome "+customerName;
	}

}
