package com.smac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.smac.controller.HelpController;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.smac.SmacCrudDemoApplication"})
//@ComponentScan(basePackageClasses = HelpController.class)
public class SmacCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmacCrudDemoApplication.class, args);
	}

}
