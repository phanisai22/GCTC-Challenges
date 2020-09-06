package com.Interface.live;

import com.Interface.music.Playable;
import com.Interface.music.string.Veena;
import com.Interface.music.wind.SaxaPhone;

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
