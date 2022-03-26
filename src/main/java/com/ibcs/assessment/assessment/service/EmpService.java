package com.ibcs.assessment.assessment.service;

import com.ibcs.assessment.assessment.entity.Emp;
import com.ibcs.assessment.assessment.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

  @Autowired
  private EmpRepository empRepository;

  public Emp saveEmp(Emp empName) {
   return empRepository.save(empName);
  }

  public Emp updateEmp(Emp empName) {
    return empRepository.save(empName);
  };

  public Iterable<Emp> getAllEmp() {
    return empRepository.findAll();
  }

  public Emp getEmpById(Long id) {
    return empRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No Emp found with id " + id));
  }

  public String deleteEmp(Long id) {
  empRepository.deleteById(id);
  return "Emp deleted successfully";
  };

}
