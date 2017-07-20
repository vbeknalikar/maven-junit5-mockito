package com.veerbeknalikar.junit5;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("JUnit5 Life Cycle Test with Nester class")
public class JUnit5TestClassLifeCycleTest {

	 static final Logger logger = Logger.getLogger(JUnit5TestClassLifeCycleTest.class.getName());;
	
	@BeforeAll
	@DisplayName("@BeforeAll annotated method is executed once initially")
	static void initAll() {
		logger.info("@BeforeAll annotated method invoked");
	}
	
	@BeforeEach
	@DisplayName("@BeforeEach annotated method is executed once before each test is executed")
	void init() {
		logger.info("@BeforeEach annotated method is invoked before each test method");
	}
	
	@Test
	@DisplayName("@Test annotated method is actual test method")
	void test1(TestInfo testInfo) {
		logger.info(() -> String.format("About to execute test method [%s]",
	            testInfo.getDisplayName()));
	}
	
	@AfterEach
	@DisplayName("@AfterEach annotated method is executed once after each test is executed")
	void tearDown() {
		logger.info("@AfterEach annotated method is invoked after each test method");
	}
	
	
	@Nested
	class NestedTestClass {
		
		
		@BeforeEach
		@DisplayName("NestedTestClass: @BeforeEach annotated method is executed once before each test is executed")
		void init() {
			logger.info("NestedTestClass: @BeforeEach annotated method is invoked before each test method");
		}
		
		@Test
		@DisplayName("NestedTestClass: @Test annotated method is actual test method")
		void test1(TestInfo testInfo) {
			logger.info(() -> String.format("NestedTestClass: About to execute test method [%s]",
		            testInfo.getDisplayName()));
		}
		
		@AfterEach
		@DisplayName("NestedTestClass: @AfterEach annotated method is executed once after each test is executed")
		void tearDown() {
			logger.info("NestedTestClass: @AfterEach annotated method is invoked after each test method");
		}
		
	}
	
	
	@AfterAll
	@DisplayName("NestedTestClass: @AfterAll annotated method is executed once at the end")
	static void tearDownAll() {
		logger.info("NestedTestClass: @AfterAll annotated method invoked");
		
	}
	
	
	
}
