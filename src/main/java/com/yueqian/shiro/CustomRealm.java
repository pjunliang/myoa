package com.yueqian.shiro;

import com.yueqian.pojo.ActiveUser;
import com.yueqian.pojo.Employee;
import com.yueqian.service.EmployeeService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

public class CustomRealm extends AuthorizingRealm {
    @Resource
    EmployeeService employeeService;


    

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Employee employee = (Employee) principalCollection;

        System.out.println("授权"+employee);
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        Employee employee = employeeService.getUserByUname(username);
        if (employee != null) {
            String password = employee.getPassword();
            ByteSource byteSource = ByteSource.Util.bytes(employee.getSalt());

            ActiveUser activeUser = new ActiveUser();
            activeUser.setId(employee.getId());
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(employee,password,byteSource,"用户认证");
            return simpleAuthenticationInfo;
        }
        return null;

    }
}
