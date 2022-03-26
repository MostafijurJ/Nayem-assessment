package com.ibcs.assessment.assessment.service;

import com.ibcs.assessment.assessment.entity.Dept;
import com.ibcs.assessment.assessment.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

  @Autowired
  private DeptRepository deptRepository;

  public Dept getDeptById(Integer deptId) {
    return deptRepository.findById(deptId)
        .orElseThrow(() -> new RuntimeException("Dept not found with id: " + deptId));
  };

  public Dept saveDept(Dept dept) {
    return deptRepository.save(dept);
  };

  public Dept updateDept(Dept dept) {
    return deptRepository.save(dept);
  };

  public String deleteDept(Integer deptId) {
    deptRepository.deleteById(deptId);
    return "Dept deleted with id: " + deptId;
  };

  public List<Dept> getAllDepts() {
    return deptRepository.findAll();
  };

}
