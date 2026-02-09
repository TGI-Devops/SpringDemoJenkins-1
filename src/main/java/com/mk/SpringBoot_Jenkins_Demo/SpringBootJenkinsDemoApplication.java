package com.mk.SpringBoot_Jenkins_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class SpringBootJenkinsDemoApplication {
 private static final Logger logger =
            LogManager.getLogger(SpringBootJenkinsDemoApplication.class);
	public static void main(String[] args) {

		 logger.info("Application started");
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);

		 logger.info("Application is working  fine");
				 logger.info("Application is working  fine");

		System.out.println("Welcome");

		add();

				System.out.println("completed ");

	}

	
	static void add(){

 logger.info("add method started ");
int a=10;
int b=20;
int c=a+b;
 System.out.println(c);
 logger.info("add method ended ");

}

}
