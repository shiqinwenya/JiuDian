package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "userinfo")
public class Userinfo {
    private Integer userid;
    private String username;
    private String userpwd;
    private String name;
    private String sex;
    private String intid;
    private Date indate;
    private String headport;

    public Userinfo() {
    }

    public Userinfo(Integer userid, String username, String userpwd, String name, String sex, String intid, Date indate, String headport) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.name = name;
        this.sex = sex;
        this.intid = intid;
        this.indate = indate;
        this.headport = headport;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIntid() {
        return intid;
    }

    public void setIntid(String intid) {
        this.intid = intid;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public String getHeadport() {
        return headport;
    }

    public void setHeadport(String headport) {
        this.headport = headport;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", intid='" + intid + '\'' +
                ", indate=" + indate +
                ", headport='" + headport + '\'' +
                '}';
    }
}
