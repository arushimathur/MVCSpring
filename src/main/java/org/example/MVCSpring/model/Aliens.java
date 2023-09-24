package org.example.MVCSpring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "alien")
public class Aliens {

    @Id
    @Column(name = "aid")
    public int aid;


    @Column(name = "aname")
    public String aname;


    @Column(name = "stDate")
    public Date stDate;

    public Aliens(int aid, String aname, Date stDate) {
        this.aid = aid;
        this.aname = aname;
        this.stDate = stDate;
    }

    public Aliens() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Date getStDate() {
        return stDate;
    }

    public void setStDate(Date stDate) {
        this.stDate = stDate;
    }

    @Override
    public String toString() {
        return "Aliens{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", stDate=" + stDate +
                '}';
    }


}
