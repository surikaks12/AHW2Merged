package com.company.domain;

import javax.persistence.*;

@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Empid", nullable = false)
    private Integer id;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Column(name = "Name")
    private String name;

    @Column(name = "Department_id")
    private Integer departmentId;

    public Employee() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}