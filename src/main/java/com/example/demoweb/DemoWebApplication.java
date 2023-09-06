package com.example.demoweb;

import com.example.demoweb.controller.HomeController;
import com.example.demoweb.dao.StudentDao;
import com.example.demoweb.entity.Student;
import com.example.demoweb.service.DiService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		HomeController service = context.getBean("homeController", HomeController.class);
//		System.out.println(service.getMessage());
//		AopService aopService = (AopService) context.getBean("aopProxy");
//		aopService.method1();
//		aopService.method2();
//		DiService diService = (DiService) context.getBean("diService");
//		diService.print();
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernateConfig.xml");
		StudentDao studentDao = context.getBean("stDao",StudentDao.class);

		Student s = new Student(101,"Nisha");
		studentDao.insert(s);

	}

}
