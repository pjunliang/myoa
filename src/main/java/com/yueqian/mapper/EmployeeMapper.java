package com.yueqian.mapper;

import com.yueqian.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
   /*根据个人用户名来查找*/
    Employee getEmployeeByEname(String ename);
}