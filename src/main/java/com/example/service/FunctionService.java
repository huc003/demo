package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by hucheng on 2017/2/26.
 */
@Service
public class FunctionService {
    public String sayHello(String world){
        return "Hello "+world +"!";
    }
}
