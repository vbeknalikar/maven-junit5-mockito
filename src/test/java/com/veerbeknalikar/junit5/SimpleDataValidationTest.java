package com.veerbeknalikar.junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author vbeknalikar
 * 
 * Basic Junit tests with new Jupiter API Test annotation and Java8 Lamda Expressions with assertAll()
 */

public class SimpleDataValidationTest {

	@Test
	@DisplayName("LoginCredentials object null")
	void loginCredentialsObjectIsNullTest() {
		LoginCredentials login = null;
		assertNull(login);
	}
	
	@Test
	@DisplayName("LoginCredentials object is not null")
	void loginCredentialsObjectIsNotNullTest() {
		LoginCredentials login = new LoginCredentials();
		assertNotNull(login);
	}
	
	@Test
	@DisplayName("LoginCredentials object is not null, userId and password are null")
	void LoginCredentialsAreNullTest() {
		LoginCredentials login = new LoginCredentials();
		assertEquals(null, login.getUserId());
		assertEquals(null, login.getPassword());
	}
	
	@Test
	@DisplayName("LoginCredentials object is not null, userId and password are not null as well")
	void LoginCredentialsAreNotNullTest() {
		LoginCredentials expectedLogin = new LoginCredentials("userid", "password");
		LoginCredentials login = new LoginCredentials("userid", "password");
		assertAll("Login Credentials", 
				() -> assertEquals(expectedLogin.getUserId(), login.getUserId()), 
				() -> assertEquals(expectedLogin.getPassword(), login.getPassword()),
				() -> assertEquals(expectedLogin, login)
				);
	}
	
}
