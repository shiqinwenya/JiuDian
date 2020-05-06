package com.example.domain;

import javax.persistence.Table;

@Table(name = "menu")
public class Menu {
    private Integer mid;
    private String mname;
    private Float mprice;
    private String type;
    private Integer menustate;
    private Integer menunumber;
    private String price;

    public Menu() {
    }

    public Menu(Integer mid, String mname, Float mprice, String type, Integer menustate, Integer menunumber, String price) {
        this.mid = mid;
        this.mname = mname;
        this.mprice = mprice;
        this.type = type;
        this.menustate = menustate;
        this.menunumber = menunumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mprice=" + mprice +
                ", type='" + type + '\'' +
                ", menustate=" + menustate +
                ", menunumber=" + menunumber +
                ", price='" + price + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Float getMprice() {
        return mprice;
    }

    public void setMprice(Float mprice) {
        this.mprice = mprice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMenustate() {
        return menustate;
    }

    public void setMenustate(Integer menustate) {
        this.menustate = menustate;
    }

    public Integer getMenunumber() {
        return menunumber;
    }

    public void setMenunumber(Integer menunumber) {
        this.menunumber = menunumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
