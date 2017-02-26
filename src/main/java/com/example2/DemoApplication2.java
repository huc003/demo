package com.example2;

import com.example2.service.FunctionService;
import com.example2.service.JavaConfig;
import com.example2.service.UseFunctionService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hucheng on 2017/2/26.
 */
@SpringBootApplication
public class DemoApplication2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        FunctionService functionService = (FunctionService)context.getBean("functionService");
        UseFunctionService useFunctionService = (UseFunctionService)context.getBean("useFunctionService");
        System.out.println(functionService.sayHello("hucehng"));
        System.out.println(useFunctionService.sayHello("zhangsan"));
        context.close();
    }
}
