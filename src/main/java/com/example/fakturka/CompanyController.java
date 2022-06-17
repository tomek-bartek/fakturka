package com.example.fakturka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CompanyController {

    RestTemplate restTemplate = new RestTemplate();
    @RequestMapping("/company")
    public String company(HttpServletRequest httpServletRequest){

        HttpSession session = httpServletRequest.getSession();
        String nip = httpServletRequest.getParameter("nip");
        session.setAttribute("nip",nip);
        String url = "https://wl-api.mf.gov.pl/api/search/nip/";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String date = simpleDateFormat.format(new Date()).toString();
        String fullUrl =url+nip+"?date="+date;
       String response= restTemplate.getForObject(fullUrl,String.class);
       session.setAttribute("response",response);
        System.out.println(response);
       return "result";
    }

}
