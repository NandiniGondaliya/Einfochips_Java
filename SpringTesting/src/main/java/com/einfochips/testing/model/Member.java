package com.einfochips.testing.model;


public class Member {
	private String email;
	private String name;
	private String mobile;
	private String gender;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Member [email=" + email + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	public Member(String email, String name, String gender, String mobile) {
		super();
		this.email = email;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	
}
