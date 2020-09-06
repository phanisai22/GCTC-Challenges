package com.Package.automobile.fourwheeler;

import com.Package.automobile.Vehicle;

public class Ford extends Vehicle {

    private int speed = 0;
    private String temp = "On";

    public Ford(String ownerName, String modelName, String registrationNumber, int speed, String radio) {
        setOwnerName(ownerName);
        setModelName(modelName);
        setRegistrationNumber(registrationNumber);
        if (speed > 0)
            this.speed = speed;
        if (radio.equals("off"))
            this.temp = radio;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTemp() {
        return temp;
    }

    public String tempControl(String temp) {
        if (temp.equals("off") && this.temp.equals("on")){
            this.temp = temp;
            return temp;

        }
        if (temp.equals("on") && this.temp.equals("off")){
            this.temp = temp;
            return temp;
        }
        return getTemp();
    }

	@Override
	public String toString() {
		return "Ford [speed=" + speed + ", temp=" + temp + ", getModelName()=" + getModelName()
				+ ", getRegistrationNumber()=" + getRegistrationNumber() + ", getOwnerName()=" + getOwnerName() + "]";
	}
    
    

}
