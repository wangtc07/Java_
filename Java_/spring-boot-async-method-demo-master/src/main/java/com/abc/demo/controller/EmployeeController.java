package com.abc.demo.controller;

import com.abc.demo.dto.EmployeeDataDto;
import com.abc.demo.dto.EmployeeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public EmployeeDataDto getEmployeeData() {
        List<EmployeeDto> employeeDtoList = Arrays.asList(
                new EmployeeDto(1L, "john"),
                new EmployeeDto(2L, "gary"));

        return new EmployeeDataDto(employeeDtoList);
    }
}
