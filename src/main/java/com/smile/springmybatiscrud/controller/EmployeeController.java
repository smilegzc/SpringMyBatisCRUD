package com.smile.springmybatiscrud.controller;

import com.smile.springmybatiscrud.entities.Department;
import com.smile.springmybatiscrud.entities.Employee;
import com.smile.springmybatiscrud.mapper.DepartmentMapper;
import com.smile.springmybatiscrud.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper empMapper;
    @Autowired
    DepartmentMapper deptMapper;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> emps = empMapper.getAllEmp();

        model.addAttribute("emps", emps);
        //thymeleaf自动为路径拼串：classpath:/templates/**.html
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = deptMapper.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        empMapper.insertEmp(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEdit(@PathVariable("id") Integer id, Model model) {
        Employee employee = empMapper.getEmpById(id);
        Collection<Department> departments = deptMapper.getDepartments();
        model.addAttribute("emp", employee);
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String editEmp(Employee employee) {
        empMapper.updateEmp(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        empMapper.delEmp(id);
        return "redirect:/emps";
    }
}
