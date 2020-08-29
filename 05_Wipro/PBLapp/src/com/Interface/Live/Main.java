package com.Interface.Live;

import com.Interface.Music.Playable;
import com.Interface.Music.String.Veena;
import com.Interface.Music.Wind.SaxaPhone;

public class Main {
    public static void main(String[] args) {

        Playable veena = new Veena();
        Playable saxaPhone = new SaxaPhone();

        veena.play();
        saxaPhone.play();
        saxaPhone.play();
        veena.play();
        veena.play();

    }
}