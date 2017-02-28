package com.example.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hucheng on 2017/2/27.
 */
@Configurable
@ComponentScan("com.example.bean")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")//初始化bean
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
