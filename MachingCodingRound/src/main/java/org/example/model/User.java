package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private Double funds;
    private List<Booking> booking;

    public User(String id, String name, Double funds) {
        this.id = id;
        this.name = name;
        this.funds = funds;
        this.booking = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", funds=" + funds +
                '}';
    }
}
