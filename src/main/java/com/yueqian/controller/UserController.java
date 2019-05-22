package com.yueqian.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Resource
    SecurityManager securityManager;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String message = (String) request.getAttribute("shiroLoginFailure");
        System.out.println(message);


        System.out.println("1111111232");

        return "/login.jsp";
    }
    @RequestMapping("/index")
    public String index(){

        System.out.println("---------------------------======-=----------------");

        return "/index.jsp";
    }
}
