package com.example.fakturka.Company;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CompanyService {

    String getCompany(String nip){

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://wl-api.mf.gov.pl/api/search/nip/";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String date = simpleDateFormat.format(new Date()).toString();
        String fullUrl =url+nip+"?date="+date;
        String response= restTemplate.getForObject(fullUrl,String.class);
        return response;
    }
}
