package com.nt.test;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;


public class SetterInjectionTest {
public static void main(String[] args) {
	Resource res=null;
	BeanFactory factory=null;

	Object obj=null;
	String str=null;
	//Hold the name and location of spring bean config
	res=new FileSystemResource("src/com/nt/config/applicationContext.xml"); 
	//Create Beanfactory IOC container
	factory=new XmlBeanFactory(res);
	//Get Target bean class Object
	//obj=factory.getBean("wmg");
	//Typecasting
	WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wmg");
	
	//Invoke Method
	str=generator.WishMessage(" Sudhanshu");
	System.out.println(str);
}
}
