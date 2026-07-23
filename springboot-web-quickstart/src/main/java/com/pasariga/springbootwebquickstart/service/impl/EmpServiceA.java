package com.pasariga.springbootwebquickstart.service.impl;

import com.pasariga.springbootwebquickstart.dao.EmpDao;
import com.pasariga.springbootwebquickstart.dao.impl.EmpDaoA;
import com.pasariga.springbootwebquickstart.pojo.Emp;
import com.pasariga.springbootwebquickstart.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {

    private EmpDao empDao = new EmpDaoA();

    @Override
    public List<Emp> listEmp() {
        // 1. 调用 Dao，获取原始员工数据
        List<Emp> empList = empDao.listEmp();

        // 2. 对员工数据进行处理
        empList.stream().forEach(emp -> {
            // 处理 gender：1 男，2 女
            String gender = emp.getGender();

            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }

            // 处理 job
            String job = emp.getJob();

            if ("1".equals(job)) {
                emp.setJob("班主任");
            } else if ("2".equals(job)) {
                emp.setJob("讲师");
            } else if ("3".equals(job)) {
                emp.setJob("学工主管");
            } else if ("4".equals(job)) {
                emp.setJob("教研主管");
            }
        });

        // 3. 返回处理后的员工数据
        return empList;
    }
}