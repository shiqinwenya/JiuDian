package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "usergetroom")
public class Usergetroom {
    private Integer getid;
    private Integer reid;
    private Integer perid;
    private Integer roomid;
    private Integer userid;
    private Long phone;
    private Integer cannumber;
    private Date cantime;
    private Date exittime;
    private String reserve;
    private Float deposit;

    public Usergetroom() {
    }

    public Usergetroom(Integer getid, Integer reid, Integer perid, Integer roomid, Integer userid, Long phone, Integer cannumber, Date cantime, Date exittime, String reserve, Float deposit) {
        this.getid = getid;
        this.reid = reid;
        this.perid = perid;
        this.roomid = roomid;
        this.userid = userid;
        this.phone = phone;
        this.cannumber = cannumber;
        this.cantime = cantime;
        this.exittime = exittime;
        this.reserve = reserve;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Usergetroom{" +
                "getid=" + getid +
                ", reid=" + reid +
                ", perid=" + perid +
                ", roomid=" + roomid +
                ", userid=" + userid +
                ", phone=" + phone +
                ", cannumber=" + cannumber +
                ", cantime=" + cantime +
                ", exittime=" + exittime +
                ", reserve='" + reserve + '\'' +
                ", deposit=" + deposit +
                '}';
    }

    public Integer getGetid() {
        return getid;
    }

    public void setGetid(Integer getid) {
        this.getid = getid;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getCannumber() {
        return cannumber;
    }

    public void setCannumber(Integer cannumber) {
        this.cannumber = cannumber;
    }

    public Date getCantime() {
        return cantime;
    }

    public void setCantime(Date cantime) {
        this.cantime = cantime;
    }

    public Date getExittime() {
        return exittime;
    }

    public void setExittime(Date exittime) {
        this.exittime = exittime;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }
}
