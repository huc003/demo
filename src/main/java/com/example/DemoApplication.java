package com.example;

import com.example.service.UseFunctionService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		//spring初始化上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		//声明bean
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("hucheng"));
		context.close();
	}
}
