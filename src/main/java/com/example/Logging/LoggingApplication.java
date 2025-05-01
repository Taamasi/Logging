package com.example.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class LoggingApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		logger.info("Application started");
	}

	@GetMapping("/log")
	public String testLogs() {
		logger.trace("This is a TRACE message");
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO message");
		logger.warn("This is a WARN message");
		logger.error("This is an ERROR message");
		return "Check the logs for output";
	}

}
