package com.example.Employee.Service;

import com.example.Employee.Model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService
{
    public Employee addNewEmployee(Employee employee);
}
