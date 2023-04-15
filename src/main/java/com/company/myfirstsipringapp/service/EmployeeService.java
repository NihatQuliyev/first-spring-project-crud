package com.company.myfirstsipringapp.service;

import com.company.myfirstsipringapp.Excaption.EmployeeNotFoundException;
import com.company.myfirstsipringapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listAll();
    void save(Employee employee);
    Employee get(Integer id) throws EmployeeNotFoundException;
    void delete(Integer id) throws EmployeeNotFoundException;
}
