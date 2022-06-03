package com.org.techm.controller;

import com.org.techm.model.Employee;
import com.org.techm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
   @Autowired
    EmployeeService employeeService;


    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);

    }
    @PutMapping("/update")
   public void  updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/deleteById{id}")
    public  String deleteById(@PathVariable Integer id){
      String rrr =  employeeService.deleteById(id);
        return  rrr;
    }
    @GetMapping("/getAll")
        public List<Employee> getAll(){
          List<Employee> list= employeeService.getAll();
          return list;


        }
        @GetMapping("/getById{id}")
        public Optional<Employee> getById(@PathVariable Integer id){
        Optional<Employee> ss = employeeService.getById(id);
        return ss;

        }
    }


