package com.example.Employee.Controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/")
public class EmployeeController
{
    //Controller Class
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("newEmployee")
    public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee)
    {
        Employee employee1 = this.employeeService.addNewEmployee(employee);
        return new ResponseEntity<>(employee1,HttpStatus.CREATED);
    }
}
