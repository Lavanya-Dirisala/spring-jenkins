package com.jenkins.JenkinsPractice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeApplication {

	static Logger logger = LoggerFactory.getLogger(JenkinsPracticeApplication.class);
	
	@PostConstruct
	public void init() {
		logger.warn("initial call");
		logger.info("Application started....");
	}
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(JenkinsPracticeApplication.class, args);
	}

}
