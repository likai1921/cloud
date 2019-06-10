package com.cloud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录控制层
 * @author Administrator
 *
 */
@RestController
public class LoginController {

	@RequestMapping(value ="/say")
	@ResponseBody
	public String sayHello(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("test!!!");
		return "hello!";
	}

}
