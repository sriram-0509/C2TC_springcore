package com.tnsif.CollegeSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	College college = context.getBean("college", College.class);
    	System.out.println(college);
        
    }
}