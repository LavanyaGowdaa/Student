package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class TestStudent {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.jsp");
		Student student=(Student)context.getBean("myStudent");
		System.out.println("The student name is  "   +student.getName());
		System.out.println(("The student id is "  + student.getId()));
		System.out.println(("The student email is "  + student.getEmail()));
		System.out.println(("The student total marks is "  + student.getTotalmarks()));
	}
}
