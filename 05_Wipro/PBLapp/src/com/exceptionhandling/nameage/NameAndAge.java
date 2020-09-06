package com.exceptionhandling.nameage;

public class NameAndAge {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Enter Name and Age only");
            return;
        }

        try {
            String name = args[0];
            int age;
            age = Integer.parseInt(args[1]);
            try {
                if (age < 18 || age > 59) {
                    throw new InvalidAgeException("Enter Age between [18, 60)");
                }
                System.out.println("Name : " + name + "\t Age : " + age);
            } catch (InvalidAgeException a) {
                System.out.println(a.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return;
        }

    }
}
