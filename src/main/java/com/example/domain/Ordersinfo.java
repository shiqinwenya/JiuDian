package com.example.domain;

import javax.persistence.Table;

@Table(name = "ordersinfo")
public class Ordersinfo {
    /* orid                 int not null,
   orderid                 int,
   mid                 int,
   number                 numeric(2,0) not null,
   cprice                   float(10,2) not null,
   primary key (orid)*/
    private Integer orid;
    private Integer orderid;
    private Integer mid;
    private Integer number;
    private Integer cprice;

    public Ordersinfo() {
    }

    public Ordersinfo(Integer orid, Integer orderid, Integer mid, Integer number, Integer cprice) {
        this.orid = orid;
        this.orderid = orderid;
        this.mid = mid;
        this.number = number;
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Ordersinfo{" +
                "orid=" + orid +
                ", orderid=" + orderid +
                ", mid=" + mid +
                ", number=" + number +
                ", cprice=" + cprice +
                '}';
    }

    public Integer getOrid() {
        return orid;
    }

    public void setOrid(Integer orid) {
        this.orid = orid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCprice() {
        return cprice;
    }

    public void setCprice(Integer cprice) {
        this.cprice = cprice;
    }
}
