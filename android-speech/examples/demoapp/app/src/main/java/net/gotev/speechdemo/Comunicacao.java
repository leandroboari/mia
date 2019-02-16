package net.gotev.speechdemo;

import net.gotev.speech.Speech;

public class Comunicacao {

    static MainActivity mainActivity;

    static void Fala(String text) {
        Speech.getInstance().say(text);
    }

    public static String Escuta() {


        return "teste";
    }

}