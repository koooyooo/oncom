package org.wonda.oncom.web.login.form;

import org.hibernate.validator.constraints.NotBlank;

/**
 * ���O�C���t�H�[��
 * 
 * @author Koyo Onda
 */
public class LoginForm {
	
	@NotBlank
	private String id;
	
	@NotBlank
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
