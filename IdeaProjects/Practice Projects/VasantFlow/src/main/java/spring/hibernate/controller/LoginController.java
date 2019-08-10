package spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import spring.hibernate.service.OauthService;

@Controller
public class LoginController {

    @Autowired
    private OauthService oauthService;

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public ModelAndView validateUser (@RequestParam("username")String username,@RequestParam("password")String password)
    {
        String msg = "";
        if(oauthService.findUser(username,password))
            msg="Welcome "+username+"!";
        else
            msg="Invalid Credentials!";

        return new ModelAndView("result.jsp","output",msg);
    }
}
