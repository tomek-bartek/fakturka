package com.example.fakturka.Company;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
public class Company {

    @JsonProperty("nip")
    @Id
    private String cNip;
    @JsonProperty("name")
    private String cName;


    @JsonProperty("workingAddress")
    private String cAddress;


    @JsonProperty("regon")
    private String cRegon;

    public Company() {
    }

    public Company(String cName, String cAddress, String cNip, String cRegon) {
        this.cName = cName;
        this.cAddress = cAddress;
        this.cNip = cNip;
        this.cRegon = cRegon;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cName='" + cName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cNip='" + cNip + '\'' +
                ", cRegon='" + cRegon + '\'' +
                '}';
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcNip() {
        return cNip;
    }

    public void setcNip(String cNip) {
        this.cNip = cNip;
    }

    public String getcRegon() {
        return cRegon;
    }

    public void setcRegon(String cRegon) {
        this.cRegon = cRegon;
    }

}
