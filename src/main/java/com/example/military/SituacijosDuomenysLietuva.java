package com.example.military;

public class SituacijosDuomenysLietuva {
    private String laikoStampas;
    private String laukoStebejimas;
    private String radaroSignalai;
    private String zvalgybosAtaskaita;

    public SituacijosDuomenysLietuva(String laikoStampas, String laukoStebejimas, String radaroSignalai, String zvalgybosAtaskaita) {
        this.laikoStampas = laikoStampas;
        this.laukoStebejimas = laukoStebejimas;
        this.radaroSignalai = radaroSignalai;
        this.zvalgybosAtaskaita = zvalgybosAtaskaita;
    }

    public String getLaikoStampas() {
        return laikoStampas;
    }

    public void setLaikoStampas(String laikoStampas) {
        this.laikoStampas = laikoStampas;
    }

    public String getLaukoStebejimas() {
        return laukoStebejimas;
    }

    public void setLaukoStebejimas(String laukoStebejimas) {
        this.laukoStebejimas = laukoStebejimas;
    }

    public String getRadaroSignalai() {
        return radaroSignalai;
    }

    public void setRadaroSignalai(String radaroSignalai) {
        this.radaroSignalai = radaroSignalai;
    }

    public String getZvalgybosAtaskaita() {
        return zvalgybosAtaskaita;
    }

    public void setZvalgybosAtaskaita(String zvalgybosAtaskaita) {
        this.zvalgybosAtaskaita = zvalgybosAtaskaita;
    }

    @Override
    public String toString() {
        return "SituacijosDuomenysLietuva{" +
                "laikoStampas='" + laikoStampas + '\'' +
                ", laukoStebejimas='" + laukoStebejimas + '\'' +
                ", radaroSignalai='" + radaroSignalai + '\'' +
                ", zvalgybosAtaskaita='" + zvalgybosAtaskaita + '\'' +
                '}';
    }
}
