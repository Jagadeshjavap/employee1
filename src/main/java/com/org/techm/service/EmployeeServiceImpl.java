package com.org.techm.service;

import com.org.techm.model.Employee;
import com.org.techm.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);

    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);

    }

    @Override
    public String deleteById(Integer id) {
        employeeRepo.deleteById(id);
        return "Success";
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> ss = employeeRepo.findAll();
        return ss;
    }

    @Override
    public Optional<Employee> getById(Integer id) {
        Optional<Employee> rr = employeeRepo.findById(id);
        return rr;
    }
}
