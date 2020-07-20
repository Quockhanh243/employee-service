package com.mor.service.common.employeeservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

  @GetMapping
  public ResponseEntity<String> test() {
    return ResponseEntity.ok("Success");
  }
}
