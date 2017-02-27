package com.example2.service;

/**
 * Created by hucheng on 2017/2/26.
 */
public class UseFunctionService {

    public FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String world){
        return functionService.sayHello(world);
//        return "Hello "+ world;
    }
}
