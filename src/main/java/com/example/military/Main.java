package com.example.military;

public class Main {
    public static void main(String[] args) {
        // Sukuriame pavyzdinius duomenis
        SituacijosDuomenysLietuva ataskaita = new SituacijosDuomenysLietuva(
                "2025-03-26 12:00",
                "Lauko stebėjimo duomenys: priešo pajėgos artėja prie sienos tai yra labai pavojinga", // pavojinga, nestabili, rami
                "radaro signalai: aukstas intensyvumas", // aukstas, vidutinis, zemas
                "zvalgybos ataskaita:  pratybos vyksta prie sienos, situacija rimta" // kritine, rimta, normali
        );

        // Analizės modelis
        TaktinioVertinimoModelis modelis = new TaktinioVertinimoModelis(ataskaita);
        if (DuomenuValidacijaModulis.validuoti(ataskaita)){
            modelis.analizuotiSituacija();
            System.out.println("Radaru rezultatas: " + modelis.getRadarVertinimas());
            System.out.println("Zvalgybos rezultatas: " + modelis.getZvalgybosRezultatas());
            System.out.println("Stebejimo rezultatas: " + modelis.getStebejimoRezultatas());
            System.out.println("Vertejimo rezultatas: " + modelis.getVertejimoRezultatas());  
        }else{
            System.out.println("Duomenų validacija nepavyko. Patikrinkite įvestus duomenis.");
        }
        

        // Drools taisyklių vykdymas
        DroolsTaisykliuValdiklis droolsValdiklis = new DroolsTaisykliuValdiklis();
        droolsValdiklis.executeRules(modelis);

        // Generuojame rekomendaciją
        String rekomendacija = VeiksmuRekomendacijosModulis.generuotiRekomendacija(modelis.getVertejimoRezultatas());
        System.out.println("Taktine - rekomendacija: " + rekomendacija);
    }
}
