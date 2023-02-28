package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "<h1 style='color:blue;text-align: center;'>" + " Hello AJ Bell, Greetings from Spring Boot + Tanzu!</h1>";
	}

}