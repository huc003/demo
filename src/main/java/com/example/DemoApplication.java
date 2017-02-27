package com.example;

import com.example.service.UseFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		//spring初始化上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		//声明bean
		UseFunctionService useFunctionService = (UseFunctionService)context.getBean("useFunctionService");
		System.out.println(useFunctionService.sayHello("hucheng"));
		context.close();
	}
}
