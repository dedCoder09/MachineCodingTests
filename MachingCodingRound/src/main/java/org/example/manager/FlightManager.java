package org.example.manager;

import org.example.model.Flight;
import org.example.model.Seat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightManager {
    List<Flight> flights;

    public FlightManager() {
        this.flights = new ArrayList<>();
    }
    public FlightManager(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFLights(Flight flight){
        flights.add(flight);
    }

    public Flight getFlight(String flightNo, String airline, Integer deptDate){
        for(Flight flight : flights){
            if(flight.getId().equals(flightNo) && flight.getAirline().equals(airline) && flight.getDeptDate() == deptDate){
                return flight;
            }
        }
        return null;
    }

    public List<Flight> searchFlight(String from, String to, Integer deptDate, Integer paxCount){
        List<Flight> flightSearchResults = new ArrayList<>();
        for(Flight flight : flights){
            if(flight.getFrom().equals(from) && flight.getTo().equals(to) && flight.getDeptDate() == deptDate
                    && flight.getSeatsAvailable() >= paxCount){
                flightSearchResults.add(flight);
            }
        }
        return flightSearchResults;
    }

    public Double checkSeatsAvailableAndPrice(Flight flight, String type, List<String> seatsToBook){
        Integer availableSeats = flight.getSeatsAvailable();
        Double amount = -1D;
        if(seatsToBook.size() > availableSeats){
            return amount;
        }

        Map<String,List<Seat>> seatList = flight.getSeats();
        List<Seat> fareTypeSeats = seatList.get(type);
        Integer availableTypeSeats = 0;
        for(String seat : seatsToBook){
            for(Seat seatFlight : fareTypeSeats){
                if(seatFlight.getId().equals(seat) && seatFlight.getEmpty()){
                    availableTypeSeats ++;
                    amount += seatFlight.getPrice();
                }
            }
        }

        if(availableTypeSeats == seatsToBook.size()){
            return  amount;
        }
        return -1D;
    }
}
