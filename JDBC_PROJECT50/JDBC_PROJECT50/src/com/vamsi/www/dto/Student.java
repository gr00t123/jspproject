package com.vamsi.www.dto;

public class Student {
	private int id;
	private String name;
	private String email;
	private int phone;
	private String pwd;
	private int marks;
	
	public Student(int id, String name, String email, int phone, String pwd, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
