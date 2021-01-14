package com.solexinc.springbootwebinterceptor.controller;

import com.solexinc.springbootwebinterceptor.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
public class IndexController {


    @RequestMapping({"/",""})
    public ModelAndView index(HttpServletRequest request, Model model) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("contents/index");
        return mv;

        }



}
