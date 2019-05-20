package com.yueqian.service;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.pojo.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements  EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public Employee getUserByUname(String ename) {
        Employee employee = employeeMapper.getEmployeeByEname(ename);
        return employee;
    }
}
