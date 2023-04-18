package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo1Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application .class, args);
//		
//		Alien alien = context.getBean(Alien.class);
//		
//		alien.show();
//		
		Student student = context.getBean(Student.class);
		
		student.show();
		
		
	}

}
