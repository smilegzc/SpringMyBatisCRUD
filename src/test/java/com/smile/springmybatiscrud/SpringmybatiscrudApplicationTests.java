package com.smile.springmybatiscrud;

import com.smile.springmybatiscrud.entities.Department;
import com.smile.springmybatiscrud.entities.Employee;
import com.smile.springmybatiscrud.mapper.DepartmentMapper;
import com.smile.springmybatiscrud.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class SpringmybatiscrudApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;
    @Test
    void contextLoads() {
        Department dept = departmentMapper.getDeptById(1);
        System.out.println(dept);
        Collection<Employee> emp = employeeMapper.getAllEmp();
        System.out.println(emp);
    }

}
