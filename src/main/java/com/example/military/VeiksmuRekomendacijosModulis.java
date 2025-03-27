package com.example.military;

public class VeiksmuRekomendacijosModulis {
    public static String generuotiRekomendacija(String vertinimoRezultatas) {
        //Labai aukstas gresmes lygis., Aukstas gresmes lygis., Vidutinis gresmes lygis., Zemas gresmes lygis., Labai zemas gresmes lygis.
        switch (vertinimoRezultatas) {
            case "Labai aukstas gresmes lygis.":
            return "Rekomendacija: Nedelsiant evakuoti civilius ir mobilizuoti visas karines pajegas.";
            case "Aukstas gresmes lygis.":
            return "Rekomendacija: Sustiprinti apsaugos priemones ir parengti atsako planus.";
            case "Vidutinis gresmes lygis.":
            return "Rekomendacija: Stebeti situacija ir pasirengti galimiems veiksmams.";
            case "Zemas gresmes lygis.":
            return "Rekomendacija: Palaikyti budruma ir reguliariai tikrinti situacija.";
            case "Labai zemas gresmes lygis.":
            return "Rekomendacija: Nereikia imtis veiksmu, bet islaikyti minimalius stebejimo protokolus.";
            default:
            return "Rekomendacija: Nepavyko sugeneruoti rekomendacijos, patikrinkite ivesta gresmes lygi.";
        }
            
        
    }
}
