package com.qfedu.hrs.domain;

import java.io.Serializable;

/**
 * �û���
 * @author ���
 *
 */
public class User implements Serializable {
	private String username;		// �û���
	private String password;			// ����
	private String email;				// ����

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}