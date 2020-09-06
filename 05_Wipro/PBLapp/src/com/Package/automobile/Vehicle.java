package com.Package.automobile;

public abstract class Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
