package com.yueqian.service;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.pojo.Employee;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.security.provider.MD5;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:activiti-context.xml", "classpath:applicationContext.xml", "classpath:applicationContext-shiro.xml",
        "classpath:mybatis-config.xml"})
public class EmployeeServiceTest {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void test1() {

        System.out.println(employeeMapper);
        String name = "zhang";
        Employee employee = employeeMapper.getEmployeeByEname(name);
        System.out.println(employee);
    }

    @Test
    public void test2() {
        String str = "111111";
        String salt = "eteokues";
        Md5Hash md5 = new Md5Hash(str,salt,2);

        System.out.println(md5.toString());
    }
}