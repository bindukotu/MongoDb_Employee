package com.faang.bindu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer")
public class Customer {
    @Id
     Integer cno;
    String cname;
    String loc;

    public Customer(Integer cno, String cname, String loc) {
        this.cno = cno;
        this.cname = cname;
        this.loc = loc;
    }
    public Customer(){}

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {

        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
