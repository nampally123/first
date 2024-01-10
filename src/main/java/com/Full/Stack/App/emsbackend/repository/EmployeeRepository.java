package com.Full.Stack.App.emsbackend.repository;


import com.Full.Stack.App.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
