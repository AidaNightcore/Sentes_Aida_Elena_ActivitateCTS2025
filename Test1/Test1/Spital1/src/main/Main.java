package main;

import clase.CameraSpitalBuilder;
import clase.ICameraSpitalBuilder;

public class Main {
    public static void main(String[] args) {

        ICameraSpitalBuilder builder = new CameraSpitalBuilder("Pacient 1");
        builder.setHalat(true).setMicDejun(true)
                .setPapuci(true).setPatRabatabil(true);

        System.out.println(builder.getCameraSpital().toString() );

    }
}