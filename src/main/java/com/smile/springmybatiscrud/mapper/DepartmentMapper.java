package com.smile.springmybatiscrud.mapper;

import com.smile.springmybatiscrud.entities.Department;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface DepartmentMapper {

    Collection<Department> getDepartments();

    Department getDeptById(int id);
}
