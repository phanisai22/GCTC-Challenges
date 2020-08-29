package com.Package.Automobile.TwoWheeler;

import com.Package.Automobile.FourWheeler.Ford;
import com.Package.Automobile.FourWheeler.Logan;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("User0022", "hero22", "1102334121", 45, "off");
        System.out.println(hero);
        System.out.println(hero.radio("off"));

        Honda honda = new Honda("User0023", "Honda2322", "0123123445", -23, "dupe");
        System.out.println(honda);
        System.out.println(honda.cdplayer("on"));
        
        Ford ford = new Ford("User0045", "Ford v Ferrari", "83483922", 99, "of");
        System.out.println(ford);
        System.out.println(ford.tempControl("off"));

        Logan logan = new Logan("User0009", "model360", "789737482", 100, "on");
        System.out.println(logan);
        System.out.println(logan.gps("o"));

    }
}
