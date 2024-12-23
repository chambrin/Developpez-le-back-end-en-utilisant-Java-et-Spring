package com.example.helloworld.service;

import com.example.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
  public HelloWorld getHelloWorld() {
    HelloWorld hw = new HelloWorld();
    return hw;
  }
}
