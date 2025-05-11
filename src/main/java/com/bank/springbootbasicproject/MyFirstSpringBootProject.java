package com.bank.springbootbasicproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootProject {
	private static final Logger logger = LoggerFactory.getLogger(MyFirstSpringBootProject.class);

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootProject.class, args);

		logger.info("Application started successfully...");
		logger.debug("This is a debug message...");

	}
}
