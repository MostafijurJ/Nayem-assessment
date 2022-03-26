package com.ibcs.assessment.assessment.entity;


import javax.persistence.*;

@Entity
public class Dept {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private Boolean isActive;

}
