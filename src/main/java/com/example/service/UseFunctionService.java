package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hucheng on 2017/2/26.
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String world){
        return functionService.sayHello("hucheng");
    }
}
