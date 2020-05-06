package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "orders")
public class Orders {
    private Integer orderid;
    private Integer roomid;
    private Integer userid;
    private Date ordertime;
    private Integer orderstate;

    public Orders() {

    }

    public Orders(Integer orderid, Integer roomid, Integer userid, Date ordertime, Integer orderstate) {
        this.orderid = orderid;
        this.roomid = roomid;
        this.userid = userid;
        this.ordertime = ordertime;
        this.orderstate = orderstate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", roomid=" + roomid +
                ", userid=" + userid +
                ", ordertime=" + ordertime +
                ", orderstate=" + orderstate +
                '}';
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }
}
