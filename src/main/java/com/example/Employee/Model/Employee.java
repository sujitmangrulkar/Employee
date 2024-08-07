package com.example.Employee.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name="Employee_Dtls")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name="Employee_Name")
    private String employeeName1;

    @Column(name="Employee_Role")
    private String employeeRole;

    @Column(name="Employee_Department")
    private String employeeDepartment;

    @Column(name="Employee_Salary")
    private Double employeeSalary;

}
