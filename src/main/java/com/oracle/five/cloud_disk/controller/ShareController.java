package com.oracle.five.cloud_disk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShareController {
	@RequestMapping("share")
	public String share(){
		
		return "share";
	}

}
