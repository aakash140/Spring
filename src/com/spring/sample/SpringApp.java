package com.spring.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApp {

	public static void main(String ...args){
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee employee=(Employee)factory.getBean("employeeBean");
		System.out.println("Emp id:"+ employee.getEmpID());
		System.out.println("Emp name:"+ employee.getName());
	}
}