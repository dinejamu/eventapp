package com.in.model;

import javax.persistence.*;

@Entity
public class event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  int eventid;
    private String name;
    private String pnumber;
    private String emailid;
    private String eventname;
    private String eventdate;
    private String eventlocation;


    @ManyToOne
    @JoinColumn(name = "sid")
    private Userdetails userdetails;

    public event() {

    }


    public Userdetails getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(Userdetails userdetails) {
        this.userdetails = userdetails;
    }

    public event(Userdetails userdetails) {

        this.userdetails = userdetails;
    }

    @Override
    public String toString() {
        return "event{" +
                "eventid=" + eventid +
                ", name='" + name + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", emailid='" + emailid + '\'' +
                ", eventname='" + eventname + '\'' +
                ", eventdate='" + eventdate + '\'' +
                ", eventlocation='" + eventlocation + '\'' +
                '}';
    }

    public event(int eventid, String name, String pnumber, String emailid, String eventname, String eventdate, String eventlocation, Userdetails userdetails) {
        this.eventid = eventid;
        this.name = name;
        this.pnumber = pnumber;
        this.emailid = emailid;
        this.eventname = eventname;
        this.eventdate = eventdate;
        this.eventlocation = eventlocation;
        this.userdetails = userdetails;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }
}
