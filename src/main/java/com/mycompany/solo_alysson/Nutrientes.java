package com.mycompany.solo_alysson;

public class Nutrientes {

    String soloTipo;
    double fosforo, potassio, calcio, magnesio, enxofre, aluminio, aluminioHidrogenio, mo;
    double Scmol, CTCcmol, vAtual, carbono, moPercentual;

    public Nutrientes(String soloTipo, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double aluminioHidrogenio, double mo, double Scmol, double CTCcmol, double vAtual, double carbono, double moPercentual) {
        this.soloTipo = soloTipo;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.aluminioHidrogenio = aluminioHidrogenio;
        this.mo = mo;
        this.Scmol = Scmol;
        this.CTCcmol = CTCcmol;
        this.vAtual = vAtual;
        this.carbono = carbono;
        this.moPercentual = moPercentual;
    }

    public Nutrientes() {
    }

    public String getSoloTipo() {
        return soloTipo;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
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

    public double getScmol() {
        return Scmol;
    }

    public double getCTCcmol() {
        return CTCcmol;
    }

    public double getvAtual() {
        return vAtual;
    }

    public double getCarbono() {
        return carbono;
    }

    public double getMoPercentual() {
        return moPercentual;
    }

    public void imprimir() {
        System.out.println("Valores do seu solo! \nFosforo: " + fosforo
                + "\nPotassio: " + potassio + "\nCalcio: " + calcio
                + "\nMagnesio: " + magnesio + "\nEnxofre: " + enxofre
                + "\nAluminio: " + aluminio + "\nAluminioHidrogenio: " + aluminioHidrogenio
                + "\nMO: " + mo + "\n");
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

    public void ideal() {
        switch (soloTipo) {
            case "argiloso":
                System.out.println("Valores ideais! \nFosforo: 9.0\nPotassio: 0.35"
                        + "\nCalcio: 6.0\nMagnesio: 1.5\nEnxofre: 9.0"
                        + "\nS cmol: " + Scmol + "\nCTC cmol: " + CTCcmol
                        + "\nV% atual: " + vAtual + "\nM.O%: " + moPercentual
                        + "%\nCarbono: " + carbono + "\n");
                break;
            case "Textura Media":
                System.out.println("Valores ideais! \nFosforo: 12.0\nPotassio: 0.25"
                        + "\nCalcio: 4.0\nMagnesio: 1.0\nEnxofre: 6.0"
                        + "\nS cmol: " + Scmol + "\nCTC cmol: " + CTCcmol
                        + "\nV% atual: " + vAtual + "\nM.O%: " + moPercentual
                        + "%\nCarbono: " + carbono + "\n");
                break;
            default:
                System.out.println("Tipo de solo Incorreto para os cálculos!");
                break;
        }
    }
}
