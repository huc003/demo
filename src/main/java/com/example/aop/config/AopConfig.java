package com.example.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * Created by huc on 2017/2/27.
 */
@Configuration//声明当前类是一个配置类
@ComponentScan("com.example.aop")//扫描包的注解
@EnableAspectJAutoProxy//注解开启Spring对AspectJ代理的支持
public class AopConfig {

}
