package com.example.fakturka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/first")
    public ModelAndView firstInvoice(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("first");

        return mv;
    }
}
