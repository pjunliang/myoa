package com.yueqian.service.impl;

import com.yueqian.mapper.EmployeeMapper;
import com.yueqian.mapper.SysPermissionMapperCustom;
import com.yueqian.mapper.SysUserRoleMapper;
import com.yueqian.pojo.*;
import com.yueqian.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private SysPermissionMapperCustom permissionMapper;
    @Autowired
    private SysUserRoleMapper userRoleMapper;


    @Override
    public Employee getUserByUname(String name) {
        Employee employee = employeeMapper.getEmployeeByEname(name);
        return employee;
    }
    @Override
    public Employee findEmployeeByName(String name) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<Employee> list = employeeMapper.selectByExample(example);

        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Employee findEmployeeManager(long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> findUsers() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public List<EmployeeCustom> findUserAndRoleList() {
        return permissionMapper.findUserAndRoleList();
    }

    @Override
    public void updateEmployeeRole(String roleId, String userId) {
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andSysUserIdEqualTo(userId);

        SysUserRole userRole = userRoleMapper.selectByExample(example).get(0);
        userRole.setSysRoleId(roleId);

        userRoleMapper.updateByPrimaryKey(userRole);
    }

    //根据员工级别查找员工信息
    @Override
    public List<Employee> findEmployeeByLevel(int level) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andRoleEqualTo(level);
        List<Employee> list = employeeMapper.selectByExample(example);

        return list;
    }

}
