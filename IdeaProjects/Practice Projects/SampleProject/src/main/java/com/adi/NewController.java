package com.adi;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class NewController
{
    @RequestMapping("/test")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response)
    {
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        User x= new User(name, email);
        Insert y=new Insert();
        y.add(name, email);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("name", name);
        mv.addObject("email", email);

        return mv;
    }
}
