package com.szt.model;

import java.util.Date;


public class User {
	
	private String address;
	private int age;
	private Date date;
	private int id;
	private String zip;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	private String name;
	private String state;
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public Date getDate() {
		return date;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setState(String state) {
		this.state = state;
	}
}
