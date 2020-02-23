package com.smile.springmybatiscrud.mapper;

import com.smile.springmybatiscrud.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface EmployeeMapper {

    Collection<Employee> getAllEmp();

    Employee getEmpById(int id);

    void insertEmp(Employee emp);

    void delEmp(int id);

    void updateEmp(Employee emp);
}
