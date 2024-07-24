package com.example.Employee.Controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("newEmployee")
    public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee)
    {
        Employee employee1 = this.employeeService.addNewEmployee(employee);
        return new ResponseEntity<>(employee1,HttpStatus.CREATED);
    }

    @GetMapping("/getallemployees")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        List<Employee> allEmployees = this.employeeService.getAllEmployees();
        return new ResponseEntity<>(allEmployees,HttpStatus.OK);
    }

    @GetMapping("/getbyid/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long employeeId)
    {
        Employee employeeById = this.employeeService.getEmployeeById(employeeId);

        return new ResponseEntity<>(employeeById,HttpStatus.OK);
    }

    @PutMapping("/updateemployee/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee , @PathVariable long employeeId)
    {
        Employee employee1 = this.employeeService.updateEmployee(employeeId, employee);
        return new ResponseEntity<>(employee1,HttpStatus.OK);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
        this.employeeService.deleteEmployee(id);
    }
}
