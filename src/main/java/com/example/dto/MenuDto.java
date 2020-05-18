package com.example.dto;

public class MenuDto extends PageDto {

    private String mname;

    public MenuDto() {
    }

    public MenuDto(String mname) {
        this.mname = mname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "mname='" + mname + '\'' +
                '}';
    }
}
