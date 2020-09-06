package com.Package.automobile.twowheeler;

import com.Package.automobile.Vehicle;

public class Hero extends Vehicle {

    private int speed = 0;
    private String radio = "On";

    public Hero(String ownerName, String modelName, String registrationNumber, int speed, String radio) {
        setOwnerName(ownerName);
        setModelName(modelName);
        setRegistrationNumber(registrationNumber);
        if (speed > 0)
            this.speed = speed;
        if (radio.equals("off"))
            this.radio = radio;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getRadio() {
        return radio;
    }

    public String radio(String radio) {
       if (radio.equals("off") && this.radio.equals("on")){
            this.radio = radio;
            return radio;

        }
        if (radio.equals("on") && this.radio.equals("off")){
            this.radio = radio;
            return radio;
        }
        return getRadio(); 
    }

	@Override
	public String toString() {
		return "Hero [speed=" + speed + ", radio=" + radio + ", getModelName()=" + getModelName()
				+ ", getRegistrationNumber()=" + getRegistrationNumber() + ", getOwnerName()=" + getOwnerName() + "]";
	}
    
    

}
