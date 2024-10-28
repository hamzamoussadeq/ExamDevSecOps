package com.ensa.exam.dao;

import com.ensa.exam.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}