package com.jmrt.cacherequestbody.controller;

import com.jmrt.cacherequestbody.model.Employee;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jramirez created on 22/07/22
 */
@Slf4j
@RestController
@RequestMapping("/employees")
public class EmployeeController {

  List<Employee> employeeList = new ArrayList<>();


  @GetMapping
  public List<Employee> getAllEmployees() {
    return this.employeeList;
  }

  @PostMapping
  public void createEmployee(@RequestBody Employee employee) {
    this.employeeList.add(employee);
    log.info(employee.toString());
  }
}