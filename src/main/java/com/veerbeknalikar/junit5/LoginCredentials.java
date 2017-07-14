package com.veerbeknalikar.junit5;

/**
 * @author vbeknalikar
 *
 */
public class LoginCredentials {
	private String userId;
	private String password;

	public LoginCredentials() {

	}

	public LoginCredentials(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		int hascode = userId.hashCode() * password.hashCode();
		return hascode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj instanceof LoginCredentials) {
			LoginCredentials login = (LoginCredentials) obj;
			if (this.userId.equals(login.getUserId()) && this.password.equals(login.getPassword())) {
				return true;
			}
		}

		return false;
	}

}
