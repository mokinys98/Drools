package com.example.military;

public class VeiksmuRekomendacijosModulis {
    public static String generuotiRekomendacija(String vertinimoRezultatas) {
        if (vertinimoRezultatas.contains("auksta")) {
            return "Mobilizuoti papildoma pajegu dali ir sustiprinti apsaugos linijas.";
        }
        return "Nereikia papildomu veiksmu.";
    }
}
