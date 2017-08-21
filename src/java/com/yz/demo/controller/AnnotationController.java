package com.yz.demo.controller;

import com.yz.demo.domain.Role;
import com.yz.demo.domain.User;
import com.yz.demo.service.UserService;
import com.yz.demo.shiro.UserRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.ExecutionException;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;


/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-12
 * <p>Version: 1.0
 */
@Controller
public class AnnotationController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "hello1.do",method =RequestMethod.POST)
    public String hello1(String username, String password, HttpSession session) {
       /* Set<String> lists=service.findRoles(username);
        System.out.println(lists);*/
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,true);
        subject.login(token);
      /*  if(lists.contains("admin")){
            subject.checkRole("admin");
            return "successadmin";
        }else if (lists.contains("customer")){
            subject.checkRole("customer");
            return "successcustomer";
        }*/
      /*User user=new User(username,password);
      session.setAttribute("user",user);*/
       // System.out.println(subject.isRemembered());
      if(subject.hasRole("admin")){
          subject.checkRole("admin");
          return "successadmin";
      }else if(subject.hasRole("customer")){
          subject.checkRole("customer");
          return  "successcustomer";
      }

       // SecurityUtils.getSubject().checkRole("admin");
      return "unauthorized";


        //subject.logout();

    }

    @RequiresRoles("admin")
    @RequestMapping("/mana_info.do")
    public String hello2() {
        System.out.println("*********");
        Subject subject = SecurityUtils.getSubject();
     /*   User user=(User)session.getAttribute("user");
        System.out.println(user);
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        subject.login(token);*/
        subject.checkRole("admin");
        return "manager_info";
    }


}
