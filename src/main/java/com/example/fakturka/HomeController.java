package com.example.fakturka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(String companyName, HttpSession session){

        System.out.print("Hi");
        return "home";
    }

    @RequestMapping("/first")
    public String firstInvoice(HttpSession session){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        String dateStringToday = dateFormat.format(date);
        session.setAttribute("today",dateStringToday);

        return "first";
    }
}
