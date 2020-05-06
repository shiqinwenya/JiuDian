package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "roomre")
public class Roomre {
    private Integer reid;
    private Integer roomid;
    private Integer userid;
    private Long phone;
    private Integer cannumber;
    private Float reservemoney;
    private Date reservetime;
    private Date reservecantime;
    private Date reserveexittime;
    private Integer reservestate;

    public Roomre() {
    }

    public Roomre(Integer reid, Integer roomid, Integer userid, Long phone, Integer cannumber, Float reservemoney, Date reservetime, Date reservecantime, Date reserveexittime, Integer reservestate) {
        this.reid = reid;
        this.roomid = roomid;
        this.userid = userid;
        this.phone = phone;
        this.cannumber = cannumber;
        this.reservemoney = reservemoney;
        this.reservetime = reservetime;
        this.reservecantime = reservecantime;
        this.reserveexittime = reserveexittime;
        this.reservestate = reservestate;
    }

    @Override
    public String toString() {
        return "Roomre{" +
                "reid=" + reid +
                ", roomid=" + roomid +
                ", userid=" + userid +
                ", phone=" + phone +
                ", cannumber=" + cannumber +
                ", reservemoney=" + reservemoney +
                ", reservetime=" + reservetime +
                ", reservecantime=" + reservecantime +
                ", reserveexittime=" + reserveexittime +
                ", reservestate=" + reservestate +
                '}';
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
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

    public Float getReservemoney() {
        return reservemoney;
    }

    public void setReservemoney(Float reservemoney) {
        this.reservemoney = reservemoney;
    }

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }

    public Date getReservecantime() {
        return reservecantime;
    }

    public void setReservecantime(Date reservecantime) {
        this.reservecantime = reservecantime;
    }

    public Date getReserveexittime() {
        return reserveexittime;
    }

    public void setReserveexittime(Date reserveexittime) {
        this.reserveexittime = reserveexittime;
    }

    public Integer getReservestate() {
        return reservestate;
    }

    public void setReservestate(Integer reservestate) {
        this.reservestate = reservestate;
    }
}
