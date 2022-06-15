package kr.co.sist.vo;

import java.util.Date;

public class MyTabVO {
	private int age ;
	private String name, email,id;
	private Date input_date;
	
	
	
	public MyTabVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getInput_date() {
		return input_date;
	}
	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}
	@Override
	public String toString() {
		return "MyTabVO [age=" + age + ", name=" + name + ", email=" + email + ", id=" + id + ", input_date="
				+ input_date + "]";
	}
	
	
	
	
}
