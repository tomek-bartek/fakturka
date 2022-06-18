package com.example.fakturka.Company;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller

public class CompanyController {

    private final CompanyService companyService;
    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService =companyService;
    }
    @GetMapping
    @RequestMapping("/company")
    public ModelAndView getCompany(@RequestParam("nip") String nip) throws JsonProcessingException {

        ModelAndView mv = new ModelAndView();

        mv.addObject("cNip",companyService.getCompany(nip).getcNip());
        mv.addObject("cName",companyService.getCompany(nip).getcName());
        mv.addObject("cAddress",companyService.getCompany(nip).getcAddress());
        mv.addObject("cRegon",companyService.getCompany(nip).getcRegon());
        mv.setViewName("result");
       return mv;
    }
    @GetMapping
    @RequestMapping("/companies")
    public ModelAndView getCompanies(){
        ModelAndView mv2 = new ModelAndView();
      List<Company> listOfCompanies = companyService.getCompanies();
      mv2.addObject("listOfCompanies",listOfCompanies);
      mv2.setViewName("allCompanies");
      return mv2;
    }



}
