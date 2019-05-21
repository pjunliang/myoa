package com.yueqian.service;

import com.yueqian.pojo.Employee;

public interface EmployeeService {
    /*根据用户名查询用户*/
    Employee getUserByUname(String name);
}
