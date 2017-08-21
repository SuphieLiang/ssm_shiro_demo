package com.yz.demo.Util;


import com.alibaba.druid.Constants;
import com.yz.demo.domain.User;
import com.yz.demo.service.UserService;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserSetting extends AccessControlFilter {
    @Autowired
    private UserService userService;

    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        if (subject == null) {
            return false;
        }
        HttpSession session = ((HttpServletRequest)request).getSession();
        User current_user = (User) session.getAttribute("user");
      //  Object recs = session.getAttribute(Constants.USER_MENUS);
        //判断session是否失效，若失效刷新之
        if(current_user == null ){
            String username = (String) subject.getPrincipal();
            User user = userService.findByUsername(username);
            session.setAttribute("user", user);
            //session.setAttribute(Constants.USER_MENUS, user.getMenus());
        }
        return true;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
            throws Exception {
        return true;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return true;
    }

}
