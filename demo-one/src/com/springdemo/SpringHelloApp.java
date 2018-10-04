package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call the beans methods
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
