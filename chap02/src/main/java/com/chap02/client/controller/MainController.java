package com.chap02.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main(/*Map<String, Object>model*/) {
		return "main";
	}
}