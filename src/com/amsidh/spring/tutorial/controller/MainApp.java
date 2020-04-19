package com.amsidh.spring.tutorial.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.spring.tutorial.domain.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Employee employee = (Employee) context.getBean("employee");
		/*Employee employee = new Employee();
		employee.setEmployeeName("Amsidh");*/
		System.out.println(employee.getEmployeeId()+"   "+employee.getEmployeeName()+"   "+employee.getAddress());
	}

}
