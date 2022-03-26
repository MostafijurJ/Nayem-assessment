package com.ibcs.assessment.assessment.entity;

import com.ibcs.assessment.assessment.enums.GENDER;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "VARCHAR(4)")
    private String code;

    @Column(nullable = false, columnDefinition = "VARCHAR(35)")
    @Size(min=2, max=35)
    private String name;

    @Column(columnDefinition = "VARCHAR(14)")
    private String phone;

    private Date dob;

    @Enumerated(EnumType.STRING)
    private GENDER gender;

    @ManyToOne
    private Dept dept;

}
