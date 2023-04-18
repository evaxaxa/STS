package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private String name;
	private int age;
	
	
	
	
	public Student() {
		super();
		System.out.println("in constructor");
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		
		System.out.println("INSIDE SHOW");
	}
	
	

}
