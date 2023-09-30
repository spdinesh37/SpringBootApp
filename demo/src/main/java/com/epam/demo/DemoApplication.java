package com.epam.demo;

import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.epam.demo"})
public class DemoApplication {
	private static Add add;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		add = context.getBean(Add.class);
				//AppContext.getApplicationContext().getBean(VaccineManagementTool.class);

		System.out.print("hello"+add.add(1,3));
	}

}
