package com.org.techm.service;

import com.org.techm.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public void createEmployee( Employee employee);
    public void  updateEmployee( Employee employee);
    public  String deleteById( Integer id);
    public List<Employee> getAll();
    public Optional<Employee> getById( Integer id);






    }
