package com.ibcs.assessment.assessment.controller;

import com.ibcs.assessment.assessment.entity.Emp;
import com.ibcs.assessment.assessment.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

  @Autowired
  private EmpService empService;


  @PostMapping("/emp")
  public Emp createEmp(@RequestBody Emp emp) {
    return empService.saveEmp(emp);
  };

  @GetMapping("/emp")
  public Iterable<Emp> getAllEmp() {
    return empService.getAllEmp();
  };

  @PutMapping("/emp")
  public Emp updateEmp(@RequestBody Emp emp) {
    return empService.updateEmp(emp);
  };

  @DeleteMapping("/emp/{id}")
  public String deleteEmp(@PathVariable Long id) {
   return empService.deleteEmp(id);
  };

  @GetMapping("/emp/{id}")
  public Emp getEmp(@PathVariable Long id) {
    return empService.getEmpById(id);
  }

}
