package com.pasariga.springbootwebquickstart.dao;

import com.pasariga.springbootwebquickstart.pojo.Emp;

import java.util.List;

public interface EmpDao {

    // 获取员工列表
    List<Emp> listEmp();

}