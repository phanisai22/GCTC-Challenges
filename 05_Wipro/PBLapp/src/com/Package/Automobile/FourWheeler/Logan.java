package com.Package.Automobile.FourWheeler;

import com.Package.Automobile.Vehicle;

public class Logan extends Vehicle {

    private int speed = 0;
    private String gps = "On";

    public Logan(String ownerName, String modelName, String registrationNumber, int speed, String radio) {
        setOwnerName(ownerName);
        setModelName(modelName);
        setRegistrationNumber(registrationNumber);
        if (speed > 0)
            this.speed = speed;
        if (radio.equals("off"))
            this.gps = radio;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getGps() {
        return gps;
    }

    public String gps(String gps) {
        if (gps.equals("off") && this.gps.equals("on")) {
            this.gps = gps;
            return gps;

        }
        if (gps.equals("on") && this.gps.equals("off")) {
            this.gps = gps;
            return gps;
        }
        return getGps();
    }

	@Override
	public String toString() {
		return "Logan [speed=" + speed + ", gps=" + gps + ", getModelName()=" + getModelName()
				+ ", getRegistrationNumber()=" + getRegistrationNumber() + ", getOwnerName()=" + getOwnerName() + "]";
	}

    

}
