package com.greens.spring_core_JPA.services;

import java.util.ArrayList;

import com.greens.spring_core_JPA.model.Employee;

public interface EmployeeService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    Employee  addEmployee(Employee emp);
    void deleteById(long id);
    void deleteAllData();
}
