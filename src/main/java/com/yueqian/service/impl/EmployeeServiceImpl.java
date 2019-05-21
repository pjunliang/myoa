package com.yueqian.service.impl;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.pojo.Employee;
import com.yueqian.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public Employee getUserByUname(String name) {
        Employee employee = employeeMapper.getEmployeeByEname(name);
        return employee;
    }
}
