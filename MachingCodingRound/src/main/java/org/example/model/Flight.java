package org.example.model;

import java.util.List;
import java.util.Map;

public class Flight {
    private String id;
    private String airline;
    private String from;
    private String to;
    private Integer seatsAvailable;
    private Integer deptDate;
    private Integer deptTime;
    private Integer arrTime;
    private Map<String,List<Seat>> seats;

    public Flight(String id, String airline, String from, String to, Integer seatsAvailable, Integer deptDate, Integer deptTime, Integer arrTime, Map<String, List<Seat>> seats) {
        this.id = id;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.seatsAvailable = seatsAvailable;
        this.deptDate = deptDate;
        this.deptTime = deptTime;
        this.arrTime = arrTime;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public Integer getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(Integer deptDate) {
        this.deptDate = deptDate;
    }

    public Integer getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(Integer deptTime) {
        this.deptTime = deptTime;
    }

    public Integer getArrTime() {
        return arrTime;
    }

    public void setArrTime(Integer arrTime) {
        this.arrTime = arrTime;
    }

    public Map<String, List<Seat>> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, List<Seat>> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", airline='" + airline + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", seatsAvailable=" + seatsAvailable +
                ", deptDate=" + deptDate +
                ", deptTime=" + deptTime +
                ", arrTime=" + arrTime +
                ", seats=" + seats +
                '}';
    }
}
