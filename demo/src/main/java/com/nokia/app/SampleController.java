package com.nokia.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

	@GetMapping("/hello")
	public String getHelloMessage() {
		return "Hello World";
	}
	
}
