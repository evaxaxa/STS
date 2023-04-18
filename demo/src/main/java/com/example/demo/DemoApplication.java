package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(DemoApplication.class, args);
	
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		
		Student a = context.getBean(Student.class);
		
//		Student student = new Student("Eva",28);
//		
		a.show();
		
		//SpringApplication.run(null, args)
		
		
	
	}

}
