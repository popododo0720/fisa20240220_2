package edu.fisa.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class citestController {
	@GetMapping("getdata")
	public String get() {
		System.out.println("citest -- change!!!!");
		return "test";
	}
}
