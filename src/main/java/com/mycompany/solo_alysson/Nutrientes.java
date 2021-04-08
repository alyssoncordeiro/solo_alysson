package com.mycompany.solo_alysson;

public class Nutrientes {

    double Scmol;
    double CTCcmol;
    double vAtual;
    double carbono;
    double moPercentual;
    double mo;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double aluminioHidrogenio;

    public Nutrientes(
            double fosforo,
            double potassio,
            double calcio,
            double magnesio,
            double enxofre,
            double aluminio,
            double aluminioHidrogenio) {
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.aluminioHidrogenio = aluminioHidrogenio;
    }

    Nutrientes() {

    }

    public double getFosforo() {
        return fosforo;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double getAluminioHidrogenio() {
        return aluminioHidrogenio;
    }

    public double getMo() {
        return mo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double calculaSCmol(double potassio, double calcio, double magnesio) {
        return Scmol = potassio + calcio + magnesio;
    }

    public double calculaCTCCmol(double aluminioHidrogenio, double Scmol) {
        return CTCcmol = aluminioHidrogenio + Scmol;
    }

    public double calculaVPercentual(double Scmol, double CTCcmol) {
        if (Scmol > 0 && CTCcmol > 0) {
            return vAtual = Scmol / CTCcmol * 100;

        } else {
            return 0.0;
        }
    }

    public double calculaMOPercentual(double mo) {
        if (mo > 0) {
            return moPercentual = mo / 10;

        } else {
            return 0.0;
        }
    }

    public double calculaCarbono(double moPercentual) {
        if (moPercentual > 0) {
            return carbono = moPercentual / 1.72 * 10;

        } else {
            return 0.0;
        }
    }
}
