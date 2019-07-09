package com.yuanfeng.controller;/**
 * Created by yuanfeng on 2019/7/9 16:59
 */

import com.sun.deploy.net.HttpResponse;
import com.yuanfeng.pojo.SysUser;
import com.yuanfeng.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *@ClassName SysUserController
 *@Description T0D0
 *@Author yuanfeng
 *@Date 2019/7/9 16:59
 *@Version 1.0
 **/

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @RequestMapping("/login")

    public void login(SysUser sysUser, HttpSession session, HttpServletResponse response, HttpServletRequest request) throws  Exception{
        SysUser user = sysUserService.login(sysUser);

        if(user!=null){
            session.setAttribute("user", user);
            response.getWriter().write("<script>location.href='"+request.getContextPath()+"/index.jsp';</script>");
        }else{
            response.getWriter().write("<script>alert('账号或密码错误!');location.href='"+request.getContextPath()+"/login.jsp';</script>");
        }
    }

}
