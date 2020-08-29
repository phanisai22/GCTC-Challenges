package com.ExeptionHandling.StudentPortal;

public class UserRegistration {

    String userName;
    String userCountry;

    public void registerUser(String userName, String userCountry) throws InvalidCountryException {
        this.userName = userName;
        if (!userCountry.equalsIgnoreCase("india")) {
            throw new InvalidCountryException("User outside India cannot be registered");
        }
        this.userCountry = userCountry;
        System.out.println("User registration done successfully");
    }
}
