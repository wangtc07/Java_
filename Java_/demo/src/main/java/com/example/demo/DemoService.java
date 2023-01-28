package com.example.demo;

import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

  private final RestTemplate restTemplate;

  @Autowired
  public DemoService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  @Async("executor")
  public CompletableFuture<String> getEmployeeData() throws InterruptedException {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + ":get employee data start");

    String employeeDataDto = restTemplate
        .getForObject("http://localhost:8080/demo/employee", String.class);

    Thread.sleep(2000);
    System.out.println(threadName + ":get employee data end");

    return CompletableFuture.completedFuture(employeeDataDto);
  }

  @Async("executor")
  public CompletableFuture<String> getDepartmentData() throws InterruptedException {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + ":get department data start");

    String departmentDataDto = restTemplate
        .getForObject("http://localhost:8080/demo/department", String.class);

    Thread.sleep(1000);
    System.out.println(threadName + ":get department data end");
    return CompletableFuture.completedFuture(departmentDataDto);
  }

}
