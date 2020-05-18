package com.example.dto;

public class RoominfoDto extends PageDto {
    private String roomtype;

    public RoominfoDto() {
    }

    public RoominfoDto(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    @Override
    public String toString() {
        return "RoominfoDto{" +
                "roomtype='" + roomtype + '\'' +
                '}';
    }
}
