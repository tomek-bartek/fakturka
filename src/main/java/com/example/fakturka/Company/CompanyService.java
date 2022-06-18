package com.example.fakturka.Company;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CompanyService {


    private final CompanyRepository companyRepository;

@Autowired
Company company;

@Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    Company getCompany(String nip) throws JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://wl-api.mf.gov.pl/api/search/nip/";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String date = simpleDateFormat.format(new Date()).toString();
        String fullUrl =url+nip+"?date="+date;
        String response= restTemplate.getForObject(fullUrl,String.class);

        JSONObject obj = new JSONObject(response);

        company.setcNip(obj.getJSONObject("result").getJSONObject("subject").getString("nip"));
        company.setcAddress(obj.getJSONObject("result").getJSONObject("subject").getString("workingAddress"));
        company.setcName(obj.getJSONObject("result").getJSONObject("subject").getString("name"));
        company.setcRegon(obj.getJSONObject("result").getJSONObject("subject").getString("regon"));
        return company;
    }

    public List<Company> getCompanies(){
    return List.of(
            new Company("1","adres","nip","regon"),
            new Company("2","adres","nip","regon"),
            new Company("3","adres","nip","regon")

    );
    }
}
