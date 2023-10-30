package org.example.manager;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> bookingList;
    FlightManager flightManager;
    UserManager userManager;

    public BookingManager(FlightManager flightManager, UserManager userManager) {
        this.bookingList = new ArrayList<>();
        this.flightManager = flightManager;
        this.userManager = userManager;
    }

    public Booking getBooking(String bookingId){
        for(Booking booking : bookingList){
            if(booking.getId().equals(bookingId)){
                return booking;
            }
        }

        System.out.println("No booking found with booking id : " + bookingId);
        return null;
    }

    public Boolean bookFlight(String userId, String flightNo, String airline, Integer deptDate, String fareType, List<String> seatList){
        User user = null;
        try{
            user = userManager.getUser(userId);
            if(user == null) {
                return false;
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return false;
        }


        Flight flight = null;
        try{
            flight = flightManager.getFlight(flightNo,airline,deptDate);
            if(flight == null){
                System.out.println("No such flights available");
                return false;
            }
            Double totalAmount = flightManager.checkSeatsAvailableAndPrice(flight,fareType,seatList);
            if(totalAmount > 0){
                user.setFunds(user.getFunds() - totalAmount);
                Booking booking = new Booking(userId,flightNo,deptDate, BookingStatus.BOOKED,fareType,seatList);
                bookingList.add(booking);
                userManager.addUserBooking(userId,booking);
                return true;
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    public Boolean cancelFlight(String userId, String bookingId){
        Booking booking = getBooking(bookingId);

        if(booking == null){
            return false;
        }

        booking.setBookingStatus(BookingStatus.CANCELED);
        return true;
    }
}
