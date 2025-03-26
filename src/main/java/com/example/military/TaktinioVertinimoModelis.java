package com.example.military;

public class TaktinioVertinimoModelis {
    private SituacijosDuomenysLietuva duomenys;
    private String vertejimoRezultatas;

    public TaktinioVertinimoModelis(SituacijosDuomenysLietuva duomenys) {
        this.duomenys = duomenys;
        this.vertejimoRezultatas = "";
    }

    // Pavyzdinis analizės metodas
    public void analizuotiSituacija() {
        // Pavyzdinė logika: jeigu radaro signalai rodo "aukštas", nustatome grėsmės lygį.
        if (duomenys.getRadaroSignalai() != null && duomenys.getRadaroSignalai().contains("aukštas")) {
            vertejimoRezultatas = "Grėsmė aukšta. Rekomenduojama sustiprinti apsaugos linijas.";
        } else {
            vertejimoRezultatas = "Situacija stabili.";
        }
    }

    public String getVertejimoRezultatas() {
        return vertejimoRezultatas;
    }

    public SituacijosDuomenysLietuva getDuomenys() {
        return duomenys;
    }
}
