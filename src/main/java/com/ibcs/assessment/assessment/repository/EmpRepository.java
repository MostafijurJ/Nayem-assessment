package com.ibcs.assessment.assessment.repository;

import com.ibcs.assessment.assessment.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
}
