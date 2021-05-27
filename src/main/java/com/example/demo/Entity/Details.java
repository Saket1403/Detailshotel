package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details")
public class Details {

	@Id
	private long id;
	private String Fullname;
	private String Email;
	private int Mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public Details(long id, String fullname, String email, int mobile) {
		super();
		this.id = id;
		this.Fullname = fullname;
		this.Email = email;
		this.Mobile = mobile;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
