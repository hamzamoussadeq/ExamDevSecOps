package com.ensa.exam.controller;

import com.ensa.exam.bean.Employee;
import com.ensa.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public Optional<Employee> findByEmail(String email) {
        return employeeService.findByEmail(email);
    }
    @GetMapping("employees")
    public <S extends Employee> List<S> findAll(Example<S> example) {
        return employeeService.findAll(example);
    }
    @PostMapping
    public <S extends Employee> S save(@RequestBody S entity) {
        return employeeService.save(entity);
    }
    @GetMapping("id/{id}")
    public Optional<Employee> findById(@PathVariable Long aLong) {
        return employeeService.findById(aLong);
    }
    @DeleteMapping("id/{id}")
    public void deleteById(Long aLong) {
        employeeService.deleteById(aLong);
    }
}
