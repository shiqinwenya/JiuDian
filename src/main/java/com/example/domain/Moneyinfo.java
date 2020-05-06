package com.example.domain;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "moneyinfo")
public class Moneyinfo {
    private Integer moneyid;
    private Integer reid;
    private Integer gitid;
    private Integer userid;
    private Integer moneysituation;
    private Float money;
    private Date transactiontime;
    private String consumptiontype;

    public Moneyinfo() {
    }

    public Moneyinfo(Integer moneyid, Integer reid, Integer gitid, Integer userid, Integer moneysituation, Float money, Date transactiontime, String consumptiontype) {

        this.moneyid = moneyid;
        this.reid = reid;
        this.gitid = gitid;
        this.userid = userid;
        this.moneysituation = moneysituation;
        this.money = money;
        this.transactiontime = transactiontime;
        this.consumptiontype = consumptiontype;
    }

    @Override
    public String toString() {
        return "Moneyinfo{" +
                "moneyid=" + moneyid +
                ", reid=" + reid +
                ", gitid=" + gitid +
                ", userid=" + userid +
                ", moneysituation=" + moneysituation +
                ", money=" + money +
                ", transactiontime=" + transactiontime +
                ", consumptiontype='" + consumptiontype + '\'' +
                '}';
    }

    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
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

    public Integer getMoneysituation() {
        return moneysituation;
    }

    public void setMoneysituation(Integer moneysituation) {
        this.moneysituation = moneysituation;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Date getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(Date transactiontime) {
        this.transactiontime = transactiontime;
    }

    public String getConsumptiontype() {
        return consumptiontype;
    }

    public void setConsumptiontype(String consumptiontype) {
        this.consumptiontype = consumptiontype;
    }
}
