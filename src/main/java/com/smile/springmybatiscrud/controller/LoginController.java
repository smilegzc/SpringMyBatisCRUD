package com.smile.springmybatiscrud.controller;

import com.smile.springmybatiscrud.entities.Department;
import com.smile.springmybatiscrud.entities.Employee;
import com.smile.springmybatiscrud.exception.MyException;
import com.smile.springmybatiscrud.mapper.DepartmentMapper;
import com.smile.springmybatiscrud.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session) {

        if(username != null && password.equals("123")) {
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        } else {
            map.put("msg", "Username or password is error!");
            return "login";
        }
    }
}