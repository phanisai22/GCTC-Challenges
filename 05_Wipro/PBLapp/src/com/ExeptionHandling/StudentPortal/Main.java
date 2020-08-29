package com.ExeptionHandling.StudentPortal;

public class Main {
    public static void main(String[] args) {
        UserRegistration mike = new UserRegistration();
        try{
            mike.registerUser("Mikey", "US");
            // mike.registerUser("Mini", "India");
        } catch (InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }
}
