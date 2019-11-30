package com.football.views;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CalendarInvite {

    private Integer startHour;
    private Integer endHour;
    private List<String> employeeList;
    private String roomName;

    @JsonProperty("startHour")
    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    @JsonProperty("endHour")
    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    @JsonProperty("employeeList")
    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    @JsonProperty("roomName")
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "CalendarInvite{" +
                "startHour=" + startHour +
                ", endHour=" + endHour +
                ", employeeList=" + employeeList +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
