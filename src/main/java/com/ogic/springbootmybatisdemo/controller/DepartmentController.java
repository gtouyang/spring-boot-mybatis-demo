package com.ogic.springbootmybatisdemo.controller;

import com.ogic.springbootmybatisdemo.bean.DepartmentBean;
import com.ogic.springbootmybatisdemo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public DepartmentBean getDepartmentById(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public DepartmentBean insertDepartment(DepartmentBean departmentBean){
        departmentMapper.insertDept(departmentBean);
        return departmentBean;
    }
}
