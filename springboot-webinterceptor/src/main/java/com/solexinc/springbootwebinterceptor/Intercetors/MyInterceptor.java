package com.solexinc.springbootwebinterceptor.Intercetors;

import com.solexinc.springbootwebinterceptor.Model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //检查session是已有属性user(User对象）
        User user = (User)request.getSession().getAttribute("user");
        if (!(null == user))
        {
            System.out.println("你已经登录");
            //response.sendRedirect(request.getContextPath());
            return false;
        }else
        {
            System.out.println("你未登录");
            return true;
        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行了登录拦截器的postHandle方法");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行了登录拦截器的afterCompletion方法");
    }
}
