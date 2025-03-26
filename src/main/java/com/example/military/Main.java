package com.example.military;

public class Main {
    public static void main(String[] args) {
        // Sukuriame pavyzdinius duomenis
        SituacijosDuomenysLietuva duomenys = new SituacijosDuomenysLietuva(
                "2025-03-26 12:00",
                "Lauko stebėjimo duomenys...",
                "radaro signalai: aukštas intensyvumas",
                "žvalgybos ataskaita..."
        );

        // Analizės modelis
        TaktinioVertinimoModelis modelis = new TaktinioVertinimoModelis(duomenys);
        modelis.analizuotiSituacija();
        System.out.println("Vertinimo rezultatas: " + modelis.getVertejimoRezultatas());

        // Drools taisyklių vykdymas
        DroolsTaisykliuValdiklis droolsValdiklis = new DroolsTaisykliuValdiklis();
        droolsValdiklis.executeRules(modelis);

        // Generuojame rekomendaciją
        String rekomendacija = VeiksmuRekomendacijosModulis.generuotiRekomendacija(modelis.getVertejimoRezultatas());
        System.out.println("Taktinė rekomendacija: " + rekomendacija);
    }
}
