package org.shivan.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n pointing to same object " + result);
		
		System.out.println("\n Memory location of coach " + theCoach);
		
		System.out.println("\n Memory location of coach " + alphaCoach);
		
		context.close();
		
		
		
		
		
	}

}
