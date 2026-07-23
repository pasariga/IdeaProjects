package com.pasariga.springbootwebquickstart.dao.impl;

import com.pasariga.springbootwebquickstart.dao.EmpDao;
import com.pasariga.springbootwebquickstart.pojo.Emp;
import com.pasariga.springbootwebquickstart.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        // 1. 获取 emp.xml 文件路径
        String file = this.getClass()
                .getClassLoader()
                .getResource("emp.xml")
                .getFile();

        System.out.println("emp.xml 文件路径：" + file);

        // 2. 解析 emp.xml 文件
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        System.out.println("解析出来的员工数量：" + empList.size());

        // 3. 返回员工列表数据
        return empList;
    }
}