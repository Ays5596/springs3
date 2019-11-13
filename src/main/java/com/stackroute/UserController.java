package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class UserController{
    User user = new User();
    @PostMapping ("/show")
    public ModelAndView getName(HttpServletRequest req) throws Exception {
        user.setName(req.getParameter("name"));
        user.setPass(req.getParameter("password"));
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("value",user.getName());
        modelAndView.addObject("value1",user.getPass());
        return  modelAndView;
    }
}
