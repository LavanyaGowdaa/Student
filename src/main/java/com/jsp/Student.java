package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myStudent")
public class Student {
	@Value(value="ram")
	private String name;
	@Value(value="101")
	private int id;
	@Value(value="250.0")
	private double totalmarks;
	@Value(value="ram@gmail.com")
	private String email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
