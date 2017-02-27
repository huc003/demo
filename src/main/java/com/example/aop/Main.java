package com.example.aop;

import com.example.aop.config.AopConfig;
import com.example.aop.service.DemoAnnotationService;
import com.example.aop.service.DemoMethodService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huc on 2017/2/27.
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //spring上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
