package com.wly;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring项目启动
 */
public class TestMain {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-${username}.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getName());
	}
}
