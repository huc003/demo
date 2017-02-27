package com.example.aop.service;

import com.example.aop.Action;
import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * Created by huc on 2017/2/27.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("注解式拦截hello");
    }
}
