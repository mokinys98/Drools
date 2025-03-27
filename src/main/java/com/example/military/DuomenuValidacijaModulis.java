package com.example.military;

public class DuomenuValidacijaModulis {

    /**
     * Patikrina, ar pateikti duomenys yra teisingi.
     *
     * @param duomenys Situacijos duomen? objektas
     * @return true, jei visi laukai u�pildyti tinkamai; false � jei tr?ksta reik�mi?
     */
    public static boolean validuoti(SituacijosDuomenysLietuva duomenys) {
        if (duomenys == null) {
            System.out.println("Klaida: Duomenys yra null.");
            return false;
        }
        if (duomenys.getLaikoStampas() == null || duomenys.getLaikoStampas().trim().isEmpty()) {
            System.out.println("Klaida: Nenurodytas laiko �ym?jimas.");
            return false;
        }
        if (duomenys.getLaukoStebejimas() == null || duomenys.getLaukoStebejimas().trim().isEmpty()) {
            System.out.println("Klaida: Nenurodytas lauko steb?jimo duomenys.");
            return false;
        }
        if (duomenys.getRadaroSignalai() == null || duomenys.getRadaroSignalai().trim().isEmpty()) {
            System.out.println("Klaida: Nenurodyti radaro signalai.");
            return false;
        }
        if (duomenys.getZvalgybosAtaskaita() == null || duomenys.getZvalgybosAtaskaita().trim().isEmpty()) {
            System.out.println("Klaida: Nenurodyta �valgybos ataskaita.");
            return false;
        }
        return true;
    }
}
