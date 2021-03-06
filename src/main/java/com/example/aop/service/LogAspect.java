package com.example.aop.service;

import com.example.aop.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 * Created by huc on 2017/2/27.
 */
@Aspect//注解声明一个切面
@Component//让次切面称为Sopring容器管理的Bean
public class LogAspect {
    @Pointcut("@annotation(com.example.aop.Action)")//注解声明切点
    public void annotationPointCut(){};

    @After("annotationPointCut()")//注解生命一个建言，并使用@PointCut定义切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截，"+action.name());//通过反射可获得注解上的属性
    }

    @Before("execution(* com.example.aop.service.DemoMethodService.*(..))")//通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，"+method.getName());
    }
}
