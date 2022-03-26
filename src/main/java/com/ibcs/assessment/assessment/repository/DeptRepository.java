package com.ibcs.assessment.assessment.repository;

import com.ibcs.assessment.assessment.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
