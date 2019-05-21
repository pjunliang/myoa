package com.yueqian.service;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:activiti-context.xml","classpath:applicationContext.xml","classpath:applicationContext-shiro.xml",
        "classpath:mybatis-config.xml"})
public class EmployeeServiceTest {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void test1(){

        System.out.println(employeeMapper);
        String name = "zhang";
        Employee employee = employeeMapper.getEmployeeByEname(name);
        System.out.println(employee);
    }
}