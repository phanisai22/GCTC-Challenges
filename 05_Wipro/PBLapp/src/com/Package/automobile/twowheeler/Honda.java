package com.Package.automobile.twowheeler;

import com.Package.automobile.Vehicle;

public class Honda extends Vehicle {
    private int speed = 0;
    private String cdplayer = "On";

    public Honda(String ownerName, String modelName, String registrationNumber, int speed, String cdplayer) {
        setOwnerName(ownerName);
        setModelName(modelName);
        setRegistrationNumber(registrationNumber);
        if (speed > 0)
            this.speed = speed;
        if (cdplayer.equals("off"))
            this.cdplayer = cdplayer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCdplayer() {
        return cdplayer;
    }

    public String cdplayer(String cdplayer) {
        if (cdplayer.equals("off") && this.cdplayer.equals("on")){
            this.cdplayer = cdplayer;
            return cdplayer;

        }
        if (cdplayer.equals("on") && this.cdplayer.equals("off")){
            this.cdplayer = cdplayer;
            return cdplayer;
        }
        return getCdplayer();
    }

	@Override
	public String toString() {
		return "Honda [speed=" + speed + ", cdplayer=" + cdplayer + ", getModelName()=" + getModelName()
				+ ", getRegistrationNumber()=" + getRegistrationNumber() + ", getOwnerName()=" + getOwnerName() + "]";
	}
    
    
}
