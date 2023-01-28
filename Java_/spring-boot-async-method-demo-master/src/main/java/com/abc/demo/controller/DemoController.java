package com.abc.demo.controller;

import com.abc.demo.dto.*;
import com.abc.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/get")
    public BasicInfoDto getBasicInfo() throws InterruptedException, ExecutionException {

        CompletableFuture<EmployeeDataDto> employeeDataDtoCompletableFuture =
                demoService.getEmployeeData();
        CompletableFuture<DepartmentDataDto> departmentDataDtoCompletableFuture =
                demoService.getDepartmentData();

        CompletableFuture.allOf(
                employeeDataDtoCompletableFuture,
                departmentDataDtoCompletableFuture
        ).join();

        List<EmployeeDto> employeeDtoList =
                employeeDataDtoCompletableFuture.get().getEmployeeDtoList();
        List<DepartmentDto> departmentDtoList =
                departmentDataDtoCompletableFuture.get().getDepartmentDtoList();

        return new BasicInfoDto(
                employeeDtoList.stream().map(EmployeeDto::getName)
                        .collect(Collectors.toList()),
                departmentDtoList.stream().map(DepartmentDto::getName)
                        .collect(Collectors.toList()));

    }

}
