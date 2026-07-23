package com.pasariga.springbootwebquickstart.service;

import com.pasariga.springbootwebquickstart.pojo.Emp;

import java.util.List;

public interface EmpService {

    // 获取员工列表
    List<Emp> listEmp();

}