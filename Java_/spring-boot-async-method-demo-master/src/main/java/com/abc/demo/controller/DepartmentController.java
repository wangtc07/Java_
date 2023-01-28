package com.abc.demo.controller;

import com.abc.demo.dto.DepartmentDataDto;
import com.abc.demo.dto.DepartmentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DepartmentController {

    @GetMapping("/department")
    public DepartmentDataDto getDepartmentData() {
        List<DepartmentDto> departmentDtoList = Arrays.asList(
                new DepartmentDto(1L, "Marketing"),
                new DepartmentDto(2L, "HR")
        );
        return new DepartmentDataDto(departmentDtoList);
    }
}
