package org.example;

import org.example.manager.BookingManager;
import org.example.manager.FlightManager;
import org.example.manager.UserManager;
import org.example.model.Flight;
import org.example.model.Seat;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        FlightManager flightManager = new FlightManager();
        Seat s1 = new Seat("1b","F1",2000D);
        Seat s2 = new Seat("2c","F1",2000D);
        Seat s3 = new Seat("4e","F1",2000D);
        List<Seat> f1Seats = new ArrayList<>();
        f1Seats.add(s1);
        f1Seats.add(s2);
        f1Seats.add(s3);
        Map<String,List<Seat>> seatMap = new HashMap<>();
        seatMap.put("F1",f1Seats);
        Flight f1 = new Flight("123","6E","DEL","BLR",3,2,10,11,seatMap);
        flightManager.addFLights(f1);
        UserManager userManager = new UserManager();
        BookingManager bookingManager = new BookingManager(flightManager,userManager);

        while(true){
            Scanner sc = new Scanner(System.in);
            String[] tokens = sc.nextLine().split(" ");
            if(tokens[0].startsWith("ADDUSER")){
                System.out.println(userManager.createUser(tokens[1],tokens[2],Double.parseDouble(tokens[3])));
            } else if(tokens[0].startsWith("SEARCHFLIGHT")){
                System.out.println(flightManager.searchFlight(tokens[1],tokens[2],Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4])));
            } else if(tokens[0].startsWith("BOOK")){
                List<String> seats = new ArrayList<>();
                for(int i = 6;i<tokens.length;i++){
                    seats.add(tokens[i]);
                }
                System.out.println(bookingManager.bookFlight(tokens[1],tokens[2],tokens[3],Integer.parseInt(tokens[4]),tokens[5],seats));
            } else if(tokens[0].startsWith("CANCEL")){
                System.out.println(bookingManager.cancelFlight(tokens[1],tokens[2]));
            } else if(tokens[0].startsWith("GET_USER_BOOKING")){
                System.out.println(userManager.getUserBooking(tokens[1]));
            }
        }
    }
}
//BOOK u1 123 6E 2 F1 1b 2c 4e