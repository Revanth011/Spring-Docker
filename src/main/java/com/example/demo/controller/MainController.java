package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MainController {
	@GetMapping("/")
	public String mainHome() {
		return "<h1>Rest Service</h1>";
	}
}
