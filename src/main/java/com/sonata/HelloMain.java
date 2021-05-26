package com.sonata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	public static void main(String [] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		HelloService service=(HelloService) context.getBean("helloWorldService");
		String message=service.sayHello();
		System.out.println(message);
		
		//set a new name
		service.setName("Spring");
		message=service.sayHello();
		System.out.println(message);
	}

}
