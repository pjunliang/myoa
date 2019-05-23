package com.yueqian.service;

import com.yueqian.pojo.Employee;
import com.yueqian.pojo.EmployeeCustom;

import java.util.List;

public interface EmployeeService {
    /*根据用户名查询用户*/
    Employee getUserByUname(String name);
    //根据员工帐号查找员工
    Employee findEmployeeByName(String name);
    //根据主键查找员工
    Employee findEmployeeManager(long id);

    List<Employee> findUsers();

    List<EmployeeCustom> findUserAndRoleList();

    void updateEmployeeRole(String roleId,String userId);

    List<Employee> findEmployeeByLevel(int level);
}
