package com.yueqian.service;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.pojo.Employee;
import org.junit.Test;

import javax.annotation.Resource;
import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void test1(){

        System.out.println(employeeMapper);
        String ename = "zhang";
        Employee employee = employeeMapper.getEmployeeByEname(ename);
        System.out.println(employee);
    }
}