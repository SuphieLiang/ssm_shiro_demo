package com.yz.demo.controller;

import com.yz.demo.domain.YaoPin;
import com.yz.demo.service.YaoPinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class YaopinControler {
    @Autowired
    private YaoPinService yaoPinService;
    @RequestMapping(value = "find.do" ,method = RequestMethod.GET)
    public String findAll(Model model,HttpSession session){
        System.out.println("qqqq");
        List<YaoPin> yaoPinList =yaoPinService.findAll();
       // modelAndView.addObject(yaoPinList);
      //  session.setAttribute("lists",yaoPinList);
        model.addAttribute("lists",yaoPinList);
        System.out.println(yaoPinList);
        return "yaopin";
    }

}
