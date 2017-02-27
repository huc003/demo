package com.example.aop.service;

import org.springframework.stereotype.Service;

/**
 * 编写使用方法规则被拦截类
 * Created by huc on 2017/2/27.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法规则式拦截hello");
    }
}
