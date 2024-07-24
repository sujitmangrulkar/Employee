package com.example.Employee.Service;

import com.example.Employee.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService
{
    public Employee addNewEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee updateEmployee(long employeeId,Employee employee);
    public Employee getEmployeeById(long employeeId);
    public void deleteEmployee(long employeeId);


}
