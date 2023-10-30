package org.example.manager;

import org.example.model.Booking;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public UserManager(List<User> users) {
        this.users = users;
    }

    public User getUser(String userId) throws RuntimeException{
        if(userId == null){
            throw new RuntimeException("userId is null for getUser");
        }

        for(User user : users){
            if(user.getId().equals(userId)){
                return user;
            }
        }
        System.out.println("userId not found");
        return null;
    }

    public User createUser(String userId, String name, Double funds){
        if(userId == null){
            throw new RuntimeException("userId can not be null for createUser");
        }

        User user = new User(userId,name,funds);
        users.add(user);
        return user;
    }

    public List<Booking> getUserBooking(String userId) throws RuntimeException{
        List<Booking> userBookings = new ArrayList<>();
        User user = getUser(userId);
        if(user != null){
            userBookings = user.getBooking();
        }
        return userBookings;
    }

    public void addUserBooking(String userId, Booking booking) throws RuntimeException{
        User user = getUser(userId);
        if(user == null){
            throw new RuntimeException("user not found for userId" + userId);
        }
        user.getBooking().add(booking);
    }
}
