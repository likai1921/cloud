package com.cloud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.dao.CloudCfgMapper;
import com.cloud.models.CloudCfg;

@RestController
public class TestController {
	
	  @Autowired
	  private CloudCfgMapper cloudCfgMapper;
	 
	
	
	@RequestMapping("/test")
	@ResponseBody	
	public String sayHello(HttpServletResponse response,HttpServletRequest request) {
		
		
		  CloudCfg cfg=new CloudCfg(); cfg.setName("测试"); cfg.setValue("123");
		  cloudCfgMapper.insert(cfg);
		 
		
		return "hello!";
	}
	
}
