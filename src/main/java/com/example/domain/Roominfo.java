package com.example.domain;

import javax.persistence.Table;

@Table(name = "roominfo")
public class Roominfo {
    private Integer roomid;
    private Float price;
    private Integer cannumber;
    private String caninfo;
    private Float deposit;
    private Float yymoney;
    private String stylemap;
    private Integer roominfo;
    private String roomtype;

    public Roominfo() {
    }

    public Roominfo(Integer roomid, Float price, Integer cannumber, String caninfo, Float deposit, Float yymoney, String stylemap, Integer roominfo, String roomtype) {
        this.roomid = roomid;
        this.price = price;
        this.cannumber = cannumber;
        this.caninfo = caninfo;
        this.deposit = deposit;
        this.yymoney = yymoney;
        this.stylemap = stylemap;
        this.roominfo = roominfo;
        this.roomtype = roomtype;
    }

    @Override
    public String
    toString() {
        return "Roominfo{" +
                "roomid=" + roomid +
                ", price=" + price +
                ", cannumber=" + cannumber +
                ", caninfo='" + caninfo + '\'' +
                ", deposit=" + deposit +
                ", yymoney=" + yymoney +
                ", stylemap='" + stylemap + '\'' +
                ", roominfo=" + roominfo +
                ", roomtype='" + roomtype + '\'' +
                '}';
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCannumber() {
        return cannumber;
    }

    public void setCannumber(Integer cannumber) {
        this.cannumber = cannumber;
    }

    public String getCaninfo() {
        return caninfo;
    }

    public void setCaninfo(String caninfo) {
        this.caninfo = caninfo;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public Float getYymoney() {
        return yymoney;
    }

    public void setYymoney(Float yymoney) {
        this.yymoney = yymoney;
    }

    public String getStylemap() {
        return stylemap;
    }

    public void setStylemap(String stylemap) {
        this.stylemap = stylemap;
    }

    public Integer getRoominfo() {
        return roominfo;
    }

    public void setRoominfo(Integer roominfo) {
        this.roominfo = roominfo;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
}
