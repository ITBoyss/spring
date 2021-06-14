package com.wly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) classPathXmlApplicationContext.getBean("person");
		System.out.println(person.getName());
	}
}
