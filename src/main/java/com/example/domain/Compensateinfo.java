package com.example.domain;

import javax.persistence.Table;

@Table(name = "compensateinfo")
public class Compensateinfo {
    private Integer comid;
    private Integer gitid;
    private Integer userid;
    private String goods;
    private Float price;
    private Integer roomid;
    private String remarks;

    public Compensateinfo() {
    }

    public Compensateinfo(Integer comid, Integer gitid, Integer userid, String goods, Float price, Integer roomid, String remarks) {
        this.comid = comid;
        this.gitid = gitid;
        this.userid = userid;
        this.goods = goods;
        this.price = price;
        this.roomid = roomid;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Compensateinfo{" +
                "comid=" + comid +
                ", gitid=" + gitid +
                ", userid=" + userid +
                ", goods='" + goods + '\'' +
                ", price=" + price +
                ", roomid=" + roomid +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public Integer getGitid() {
        return gitid;
    }

    public void setGitid(Integer gitid) {
        this.gitid = gitid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
