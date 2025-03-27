package main;

import clase.IBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder("Client 1");
        Rezervare rezervare;
        Rezervare rezervare1;

        IBuilder rezervareBuilder1 = new RezervareBuilder("Client 2");
        rezervare = rezervareBuilder.buildRezervate();
        rezervare1 = rezervareBuilder1.setGenMuzica("rock").buildRezervate();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}