package com.example.domain;

import javax.persistence.Table;

@Table(name = "personnel")
public class Personnel {
    private Integer perid;
    private String pername;
    private String perpwd;

    public Personnel() {
    }

    public Personnel(Integer perid, String pername, String perpwd) {
        this.perid = perid;
        this.pername = pername;
        this.perpwd = perpwd;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public String getPerpwd() {
        return perpwd;
    }

    public void setPerpwd(String perpwd) {
        this.perpwd = perpwd;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "perid=" + perid +
                ", pername='" + pername + '\'' +
                ", perpwd='" + perpwd + '\'' +
                '}';
    }
}
