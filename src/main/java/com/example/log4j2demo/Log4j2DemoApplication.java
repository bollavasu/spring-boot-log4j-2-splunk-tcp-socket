package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2DemoApplication implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {	
		logger.info("THIS IS A INFO MESSAGE NEW");
		logger.debug("THIS IS A DEBUG MESSAGE NEW");
		logger.warn("THIS IS A WARN MESSAGE NEW");
		logger.error("THIS IS A ERROR MESSAGE NEW");
		logger.fatal("THIS IS A FATAL MESSAGE NEW");
	}
}
