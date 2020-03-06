package com.smile.springmybatiscrud.entities;

import lombok.Data;

@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private String birth;
    private Department department;
}