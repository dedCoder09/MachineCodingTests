package org.example.model;

import java.util.List;
import java.util.UUID;

public class Booking {
    private String id;
    private String userId;
    private String flightNo;
    private Integer DeptDate;
    private BookingStatus bookingStatus;
    private String fareType;
    private List<String> seatList;

    public Booking(String userId, String flightNo, Integer deptDate, BookingStatus bookingStatus, String fareType, List<String> seatList) {
        this.id = UUID.randomUUID().toString().replaceAll("-","");
        this.userId = userId;
        this.flightNo = flightNo;
        DeptDate = deptDate;
        this.bookingStatus = bookingStatus;
        this.fareType = fareType;
        this.seatList = seatList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Integer getDeptDate() {
        return DeptDate;
    }

    public void setDeptDate(Integer deptDate) {
        DeptDate = deptDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public List<String> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<String> seatList) {
        this.seatList = seatList;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", DeptDate='" + DeptDate + '\'' +
                ", bookingStatus=" + bookingStatus +
                ", fareType='" + fareType + '\'' +
                ", seatList=" + seatList +
                '}';
    }
}
