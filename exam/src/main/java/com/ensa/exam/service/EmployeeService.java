package com.ensa.exam.service;

import com.ensa.exam.bean.Employee;
import com.ensa.exam.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Optional<Employee> findByEmail(String email) {
        return employeeDao.findByEmail(email);
    }

    public <S extends Employee> List<S> findAll(Example<S> example) {
        return employeeDao.findAll(example);
    }

    public <S extends Employee> S save(S entity) {
        return employeeDao.save(entity);
    }

    public Optional<Employee> findById(Long aLong) {
        return employeeDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        employeeDao.deleteById(aLong);
    }
}

