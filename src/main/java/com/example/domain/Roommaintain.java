package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "roommaintain")
public class Roommaintain {
    private Integer mainid;
    private Integer roomid;
    private Date maingotime;
    private Date mainexittime;
    private Float mainmooney;

    public Roommaintain() {
    }

    public Roommaintain(Integer mainid, Integer roomid, Date maingotime, Date mainexittime, Float mainmooney) {
        this.mainid = mainid;
        this.roomid = roomid;
        this.maingotime = maingotime;
        this.mainexittime = mainexittime;
        this.mainmooney = mainmooney;
    }

    @Override
    public String toString() {
        return "Roommaintain{" +
                "mainid=" + mainid +
                ", roomid=" + roomid +
                ", maingotime=" + maingotime +
                ", mainexittime=" + mainexittime +
                ", mainmooney=" + mainmooney +
                '}';
    }

    public Integer getMainid() {
        return mainid;
    }

    public void setMainid(Integer mainid) {
        this.mainid = mainid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Date getMaingotime() {
        return maingotime;
    }

    public void setMaingotime(Date maingotime) {
        this.maingotime = maingotime;
    }

    public Date getMainexittime() {
        return mainexittime;
    }

    public void setMainexittime(Date mainexittime) {
        this.mainexittime = mainexittime;
    }

    public Float getMainmooney() {
        return mainmooney;
    }

    public void setMainmooney(Float mainmooney) {
        this.mainmooney = mainmooney;
    }
}
