package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	private String password;
	private String passwordConfirm;

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
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

	@Transient
	public String getPasswordConfirm() {
	    return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
	    this.passwordConfirm = passwordConfirm;
	}

}
