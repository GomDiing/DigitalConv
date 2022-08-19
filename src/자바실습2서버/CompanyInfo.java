package 자바실습2서버;

import java.io.Serializable;

public class CompanyInfo implements Serializable {

    private String name;
    private String number;
    private String company;
    private String email;

    public CompanyInfo(String name, String number, String company, String email) {
        this.name = name;
        this.number = number;
        this.company = company;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
