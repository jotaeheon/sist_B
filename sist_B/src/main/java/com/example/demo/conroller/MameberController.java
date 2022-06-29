package com.example.demo.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MameberController {

	
	@GetMapping("/list.do")
	public String list() {
		
		return "회원목록";
	}
}
