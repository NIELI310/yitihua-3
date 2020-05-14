package cn.edu.nenu.controller;

import jdk.internal.instrumentation.Logger;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;


@CommonsLog
@Controller
//@RequestMapping("/login")
public class LoginCon {

    @RequestMapping(value = {"/index","/"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(ServletRequest request, Model model){
        String username = request.getParameter("username");
        Logger log = null;
        log.info(username);
        model.addAttribute("username",username);
        return "loginsuccess";
    }
}
