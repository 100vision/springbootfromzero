package com.solexinc.springbootwebinterceptor.controller;


import com.solexinc.springbootwebinterceptor.Model.User;
import com.solexinc.springbootwebinterceptor.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.messageresolver.IMessageResolver;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @Autowired
    private IUserService userService;

    @RequestMapping(value="/user/login",method = RequestMethod.POST )
    public ModelAndView doLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        if(userService.dologin(username,password))
        {
            session.setAttribute("user",new User(username,password));
            ModelAndView mv = new ModelAndView();
            mv.addObject("user", (User)session.getAttribute("user"));
            mv.setViewName("/contents/dashboard");
            return mv;
        }else
        {

            return new ModelAndView("redirect:/user/login");
        }



    }

    @RequestMapping(value="/user/login",method = RequestMethod.GET)
    public String toLogin()
    {
        return "user/login";
    }

}


