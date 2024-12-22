package com.greens.spring_core_JPA.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.greens.spring_core_JPA.model.Employee;
import com.greens.spring_core_JPA.services.EmpServiceImpl;


@RestController
public class EmpController {
  
    @Autowired
    EmpServiceImpl empServiceImpl;

    @PostMapping("/add")
    public void add(@RequestBody Employee employee ) {
        empServiceImpl.addEmployee(employee);
    }

    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
    
    @PutMapping("/update/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id,@RequestBody Employee employee) {
        return empServiceImpl.update(id, employee);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteByID(@PathVariable long id) {
        empServiceImpl.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }
}