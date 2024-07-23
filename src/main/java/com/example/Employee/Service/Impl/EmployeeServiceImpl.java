package com.example.Employee.Service.Impl;

import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployees()
    {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(long employeeId, Employee employee)
    {
        Optional<Employee> employeeexists = this.employeeRepository.findById(employeeId);
        Employee emp = new Employee();
        if(employeeexists!=null)
        {
            emp.setEmployeeName(employee.getEmployeeName());
            emp.setEmployeeRole(employee.getEmployeeRole());
            emp.setEmployeeDepartment(employee.getEmployeeDepartment());
            emp.setEmployeeSalary(employee.getEmployeeSalary());
            employeeRepository.save(emp);
        }
        else
        {
            System.out.println("Employee Not Found...!");
        }

        return emp;
    }

    @Override
    public Employee getEmployeeById(long employeeId)
    {
        Optional<Employee> employeeCheck = this.employeeRepository.findById(employeeId);

        Employee emp1 = new Employee();
        emp1.setEmployeeId(employeeId);
        emp1.setEmployeeName(employeeCheck.get().getEmployeeName());
        emp1.setEmployeeDepartment(employeeCheck.get().getEmployeeDepartment());
        emp1.setEmployeeSalary(employeeCheck.get().getEmployeeSalary());
        emp1.setEmployeeRole(employeeCheck.get().getEmployeeRole());

        return emp1;
    }

    @Override
    public void deleteEmployee(long employeeId)
    {
        this.employeeRepository.deleteById(employeeId);
        System.out.println("Employee Deleted Successfully");
    }
}
