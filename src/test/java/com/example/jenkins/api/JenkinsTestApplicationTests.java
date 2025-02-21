package com.example.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);

	@Test
	public void contextLoads() {

		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
