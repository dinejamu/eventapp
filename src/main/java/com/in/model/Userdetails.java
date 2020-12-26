package com.in.model;
import javax.persistence.*;


@Entity
public class Userdetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int sid;
    private String name;
    private String userid;
    private String ename;
    private String password;
    private Boolean isactived;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eventid")
    private event eve;

    public Userdetails() {

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEventname() {
        return ename;
    }

    public void setEventname(String eventname) {
        this.ename = eventname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsactived() {
        return isactived;
    }

    public void setIsactived(Boolean isactived) {
        this.isactived = isactived;
    }

    public event getEve() {
        return eve;
    }

    public void setEve(event eve) {
        this.eve = eve;
    }

    public Userdetails(int sid, String name, String userid, String eventname, String password, Boolean isactived, event eve) {
        this.sid = sid;
        this.name = name;
        this.userid = userid;
        this.ename = eventname;
        this.password = password;
        this.isactived = isactived;
        this.eve = eve;
    }
}
