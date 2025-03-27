package com.example.military;

public class TaktinioVertinimoModelis {
    private SituacijosDuomenysLietuva duomenys;
    private String vertejimoRezultatas;
    private String radaroVertinimas;
    private String zvalgybosRezultatas;
    private String stebejimoRezultatas;

    public TaktinioVertinimoModelis(SituacijosDuomenysLietuva duomenys) {
        this.duomenys = duomenys;
        
        this.radaroVertinimas = "";
        this.zvalgybosRezultatas = "";
        this.stebejimoRezultatas = "";
        
        this.vertejimoRezultatas = "";
    }

    public void analizuotiSituacija() {
        analizuotiRadaruSignalai();
        analizuotiZvalgybosAtaskaita();
        analizuotiLaukoStebejimoAtaskaita();
        
        // Logika vertinimo prisilyginame ataskaitas ir nustatome bendra vertinimo rezultatą
        int radaroVertinimasSkaicius = radaroVertinimas.contains("auksta") ? 3 :
                           radaroVertinimas.contains("vidutini") ? 2 :
                           radaroVertinimas.contains("zema") ? 1 : 0;

        int zvalgybosVertinimasSkaicius = zvalgybosRezultatas.contains("kritine") ? 3 :
                          zvalgybosRezultatas.contains("rimta") ? 2 :
                          zvalgybosRezultatas.contains("normali") ? 1 : 0;

        int stebejimoVertinimasSkaicius = stebejimoRezultatas.contains("pavojinga") ? 3 :
                          stebejimoRezultatas.contains("nestabili") ? 2 :
                          stebejimoRezultatas.contains("rami") ? 1 : 0;

        int bendrasVertinimas = radaroVertinimasSkaicius + zvalgybosVertinimasSkaicius + stebejimoVertinimasSkaicius;

        if (bendrasVertinimas >= 9) {
            vertejimoRezultatas = "Labai aukstas gresmes lygis.";
        } else if (bendrasVertinimas >= 7) {
            vertejimoRezultatas = "Aukstas gresmes lygis.";
        } else if (bendrasVertinimas >= 5) {
            vertejimoRezultatas = "Vidutinis gresmes lygis.";
        } else if (bendrasVertinimas >= 3) {
            vertejimoRezultatas = "Zemas gresmes lygis.";
        } else {
            vertejimoRezultatas = "Labai zemas gresmes lygis.";
        }
    }

    // Pavyzdinis analizės metodas
    public void analizuotiRadaruSignalai() {
        // Pavyzdinė logika: jeigu radaro signalai rodo "aukštas", nustatome grėsmės lygį.
        if (duomenys.getRadaroSignalai() == null) {
            radaroVertinimas = "Radaro duomenys nebuvo gauti";
            return;
        }
        if (duomenys.getRadaroSignalai().contains("aukstas")) {
            radaroVertinimas = "Radaro signalai rodo auksta gresmes lygi.";
        } else if (duomenys.getRadaroSignalai().contains("vidutinis")) {
            radaroVertinimas = "Radaro signalai rodo vidutini gresmes lygi.";
        } else if (duomenys.getRadaroSignalai().contains("zemas")) {
            radaroVertinimas = "Radaro signalai rodo zema gresmes lygi.";
        } else {
            radaroVertinimas = "Situacija stabili.";
        }
        
    }

    // Naujas metodas žvalgybos ataskaitos analizei
    public void analizuotiZvalgybosAtaskaita() {
        if (duomenys.getZvalgybosAtaskaita() == null) {
            zvalgybosRezultatas = "Žvalgybos ataskaita nebuvo gauta";
            return;
        }
        if (duomenys.getZvalgybosAtaskaita().contains("kritine")) {
            zvalgybosRezultatas = "zvalgybos ataskaita rodo kritine situacija.";
        } else if (duomenys.getZvalgybosAtaskaita().contains("rimta")) {
            zvalgybosRezultatas = "zvalgybos ataskaita rodo rimta situacija.";
        } else if (duomenys.getZvalgybosAtaskaita().contains("normali")) {
            zvalgybosRezultatas = "zvalgybos ataskaita rodo normalia situacija.";
        } else {
            zvalgybosRezultatas = "zvalgybos ataskaita nerodo jokiu gresmiu.";
        }
    }

    // Naujas metodas lauko stebėjimo ataskaitos analizei
    public void analizuotiLaukoStebejimoAtaskaita() {
        if (duomenys.getLaukoStebejimas() == null) {
            stebejimoRezultatas = "Lauko stebejimo ataskaita nebuvo gauta";
            return;
        }
        if (duomenys.getLaukoStebejimas().contains("pavojinga")) {
            stebejimoRezultatas = "Lauko stebejimo ataskaita rodo pavojinga situacija.";
        } else if (duomenys.getLaukoStebejimas().contains("nestabili")) {
            stebejimoRezultatas = "Lauko stebejimo ataskaita rodo nestabilia situacija.";
        } else if (duomenys.getLaukoStebejimas().contains("rami")) {
            stebejimoRezultatas = "Lauko stebejimo ataskaita rodo ramia situacija.";
        } else {
            stebejimoRezultatas = "Lauko stebejimo ataskaita nerodo jokiu gresmiu.";
        }
    }


    public SituacijosDuomenysLietuva getDuomenys() {
        return duomenys;
    }

    public String getVertejimoRezultatas() {
        return vertejimoRezultatas;
    }

    public String getRadarVertinimas() {
        return radaroVertinimas;
    }

    public String getZvalgybosRezultatas() {
        return zvalgybosRezultatas;
    }

    public String getStebejimoRezultatas() {
        return stebejimoRezultatas;
    }
}
