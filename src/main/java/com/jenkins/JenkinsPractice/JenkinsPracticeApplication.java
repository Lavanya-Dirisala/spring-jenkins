package com.jenkins.JenkinsPractice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JenkinsPracticeApplication {

	static Logger logger = LoggerFactory.getLogger(JenkinsPracticeApplication.class);
	
	@PostConstruct
	public static void init() {
		logger.warn("initial call");
		logger.info("Application started....");
		Printing print = new Printing();
		List list = print.print1to10numbers();
		logger.info("List of numbers "+ list);

	}
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(JenkinsPracticeApplication.class, args);
	}

}
