package com.weeks.entity;

import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {
    private Integer uid;
    private String uname;
    private String pwd;
    private String address;
    private Date birthday;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Userinfo(Integer uid, String uname, String pwd, String address, Date birthday) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.address = address;
        this.birthday = birthday;
    }

    public Userinfo(String uname, String pwd, String address, Date birthday) {
        this.uname = uname;
        this.pwd = pwd;
        this.address = address;
        this.birthday = birthday;
    }

    public Userinfo() {
    }
}
