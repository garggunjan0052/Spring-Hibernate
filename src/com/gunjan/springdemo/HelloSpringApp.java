package com.gunjan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//spring container
		//struts servlet container
		// retrieve bean
		Coach theCoach = context.getBean("myCoach", Coach.class);//Type casting for spring 
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
		System.out.println("Closed");
	}

}
