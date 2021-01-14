package com.solexinc.springbootwebinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {
    @RequestMapping("/user/logout")
    public String logout(HttpSession session, Model model)
    {
        session.removeAttribute("user");
        return "redirect:/user/login";
    }

}
