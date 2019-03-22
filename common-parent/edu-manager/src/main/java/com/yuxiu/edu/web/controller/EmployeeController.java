package com.yuxiu.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @RequestMapping("manage")
    public String manage(){
        return "employee/manage";
    }

    @RequestMapping("edit")
    public String edit(){
        return "employee/edit";
    }

    @RequestMapping("info")
    public String info(){
        return "employee/info";
    }
}
