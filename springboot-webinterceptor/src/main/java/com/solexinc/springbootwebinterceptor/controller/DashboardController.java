package com.solexinc.springbootwebinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public ModelAndView dashboard(HttpSession session, Model model)
    {
        ModelAndView mv = new ModelAndView();
        if(null == session.getAttribute("user"))
        {
            mv.setViewName("redirect:/user/login");
            return mv;
        }else
        {
            mv.setViewName("contents/dashboard");
            return mv;
        }
    }
}
