package com.example.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by hucheng on 2017/2/27.
 */
public class JSR250WayService {
    @PostConstruct//在构造函数执行完之后
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy//在bean销毁之前
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
