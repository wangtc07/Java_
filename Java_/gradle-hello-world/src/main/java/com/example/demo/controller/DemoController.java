package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @RequestMapping("/")
  public void demo(){
    System.out.println("demo");
  }

  @GetMapping("/hello")
  public String sendGreetings() {
    return "Hello, World!";
  }
}
