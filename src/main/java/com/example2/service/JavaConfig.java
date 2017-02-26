package com.example2.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by hucheng on 2017/2/26.
 */
@Configurable
public class JavaConfig {
    //声明方法返回一个bean
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        return new UseFunctionService();
    }

}
