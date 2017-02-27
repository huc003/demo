package com.example.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by huc on 2017/2/27.
 */
@Service
@Scope("prototype")//声明Scope为Prototype，原型模式
public class DemoPrototypeService {

}
