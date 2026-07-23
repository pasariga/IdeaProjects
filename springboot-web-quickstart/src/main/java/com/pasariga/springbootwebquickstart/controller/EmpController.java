package com.pasariga.springbootwebquickstart.controller;

import com.pasariga.springbootwebquickstart.pojo.Emp;
import com.pasariga.springbootwebquickstart.pojo.Result;
import com.pasariga.springbootwebquickstart.service.EmpService;
import com.pasariga.springbootwebquickstart.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    private EmpService empService = new EmpServiceA();

    @RequestMapping("/listEmp")
    public Result list() {
        // 1. 调用 Service，获取数据
        List<Emp> empList = empService.listEmp();

        // 2. 返回数据
        return Result.success(empList);
    }
}