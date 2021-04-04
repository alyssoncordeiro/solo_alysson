package com.mycompany.solo_alysson;

public class Solo {

    String soloTipo;
    double fosforo, potassio, calcio, magnesio, enxofre, aluminio, aluminioHidrogenio, m_o;
    double sCmol, ctcCmol, vAtual, carbono, m_oPer;

    public Solo(String soloTipo, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double aluminioHidrogenio, double m_o, double sCmol, double ctcCmol, double vAtual, double carbono, double m_oPer) {
        this.soloTipo = soloTipo;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.aluminioHidrogenio = aluminioHidrogenio;
        this.m_o = m_o;
        this.sCmol = sCmol;
        this.ctcCmol = ctcCmol;
        this.vAtual = vAtual;
        this.carbono = carbono;
        this.m_oPer = m_oPer;
    }

    public Solo() {
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

    public double getM_o() {
        return m_o;
    }

    public double getsCmol() {
        return sCmol;
    }

    public double getCtcCmol() {
        return ctcCmol;
    }

    public double getvAtual() {
        return vAtual;
    }

    public double getCarbono() {
        return carbono;
    }

    public double getM_oPer() {
        return m_oPer;
    }

    public void imprimir() {
        System.out.println("Valores do seu solo! \nFosforo: " + fosforo
                + "\nPotassio: " + potassio + "\nCalcio: " + calcio
                + "\nMagnesio: " + magnesio + "\nEnxofre: " + enxofre
                + "\nAluminio: " + aluminio + "\nAluminioHidrogenio: " + aluminioHidrogenio
                + "\nMO: " + m_o + "\n");
    }

    //Calculos feitos em 28 linhas de código (Senhor estipulou 40)
    public void calculos() {
        sCmol = potassio + calcio + magnesio;
        ctcCmol = aluminioHidrogenio + sCmol;
        vAtual = 100 * sCmol / ctcCmol;
        m_oPer = m_o / 10;
        carbono = m_oPer / 1.72 * 10;
    }

    public void ideal() {
        switch (soloTipo) {
            case "argiloso":
                System.out.println("Valores ideais! \nFosforo: 9.0\nPotassio: 0.35"
                        + "\nCalcio: 6.0\nMagnesio: 1.5\nEnxofre: 9.0"
                        + "\nS cmol: " + sCmol + "\nCTC cmol: " + ctcCmol
                        + "\nV% atual: " + vAtual + "\nM.O%: " + m_oPer
                        + "%\nCarbono: " + carbono + "\n");
                break;
            case "Textura Media":
                System.out.println("Valores ideais! \nFosforo: 12.0\nPotassio: 0.25"
                        + "\nCalcio: 4.0\nMagnesio: 1.0\nEnxofre: 6.0"
                        + "\nS cmol: " + sCmol + "\nCTC cmol: " + ctcCmol
                        + "\nV% atual: " + vAtual + "\nM.O%: " + m_oPer
                        + "%\nCarbono: " + carbono + "\n");
                break;
            default:
                System.out.println("Tipo de solo Incorreto para os cálculos!");
                break;
        }
    }
}
