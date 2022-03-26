package com.ibcs.assessment.assessment.controller;

import com.ibcs.assessment.assessment.entity.Dept;
import com.ibcs.assessment.assessment.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

  @Autowired
  private DeptService deptService;

  @PostMapping("/dept")
  public Dept createDept(@RequestBody Dept dept) {
    return deptService.saveDept(dept);
  };

  @GetMapping("/dept")
  public Iterable<Dept> getAllDept() {
    return deptService.getAllDepts();
  };

  @PutMapping("/dept")
  public Dept updateDept(@RequestBody Dept dept) {
    return deptService.updateDept(dept);
  };

  @DeleteMapping("/dept/{id}")
  public void deleteDept(@PathVariable("id") int id) {
    deptService.deleteDept(id);
  };

  @GetMapping("/dept/{id}")
  public Dept getDept(@PathVariable("id") int id) {
    return deptService.getDeptById(id);
  };

}
