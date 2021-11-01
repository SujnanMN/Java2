package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import employee.pack.Employee;


@SpringBootApplication
public class TestApplication {

	private static final String APPLICATION_CONTEXT_XML = "Employee.xml";


	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);


				ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("sett.xml");
				Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
				//Car car = new Car();
				vehicle.drive();

		//driveVehicle();
		BeanFactory factory = loadContext();

		Employee employee = (Employee)factory.getBean("employee");  
		employee.show(); 
	}


	private static void driveVehicle() {
		ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("sett.xml");
		Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
		//Car car = new Car();
		vehicle.drive();
	}

	private static BeanFactory loadContext() {
		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML);  
		BeanFactory factory = new XmlBeanFactory(resource);
		return factory;
	}
}

