package com.oracle.five.cloud_disk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping("/index")
	public String test(){
		return "template";
	}

}
