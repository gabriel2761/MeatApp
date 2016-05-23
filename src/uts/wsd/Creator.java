package uts.wsd;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Creator implements Serializable {

	private String username;
	private String password;
	private String email;

	public Creator() {
	}

	public Creator(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email= email;
	}

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