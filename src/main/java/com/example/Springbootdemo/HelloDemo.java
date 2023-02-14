package com.example.Springbootdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class HelloDemo {

	@GetMapping("/get")
	public String sayHello() {
		return "Hello ! Welcome to Spring boot application";

	}

}
