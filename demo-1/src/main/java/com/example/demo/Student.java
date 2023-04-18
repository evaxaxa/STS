package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
	

	private String name;
	private int age;
	@Autowired
	private Alien alien;
	
	
	public Student() {
		super();
		System.out.println("------CON------");
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
		
		System.out.println("INSIDE Student");
		alien.show();
	}

	


}
