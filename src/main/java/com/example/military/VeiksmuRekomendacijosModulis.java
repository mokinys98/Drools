package com.example.military;

public class VeiksmuRekomendacijosModulis {
    public static String generuotiRekomendacija(String vertinimoRezultatas) {
        if (vertinimoRezultatas.contains("aukšta")) {
            return "Mobilizuoti papildomą pajėgų dalį ir sustiprinti apsaugos linijas.";
        }
        return "Nereikia papildomų veiksmų.";
    }
}
