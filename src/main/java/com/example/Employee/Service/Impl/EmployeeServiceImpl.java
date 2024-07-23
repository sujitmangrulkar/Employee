package com.example.Employee.Service.Impl;

import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addNewEmployee(Employee employee)
    {
        return this.employeeRepository.save(employee);
    }
}
