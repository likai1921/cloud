package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 工程启动入口
 * @author lk
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.cloud.*","com.cloud.mapper.*","com.cloud.controller.*"})
@ComponentScan(value = {"com.cloud.*"})
public class ApplicationRun {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRun.class, args);
	}

}
