/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solo_alysson;

/**
 *
 * @author Alysson Cordeiro
 */
public class Solo {

    int soloId, prodId;
    double fosforo, potassio, calcio, magnesio, enxofre, aluminio, hal, m_o;
    double sCmol, ctcCmol, vAtual, carbono, m_oPer;

    public Solo(int soloId, int prodId, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double hal, double m_o, double sCmol, double ctcCmol, double vAtual, double carbono, double m_oPer) {
        this.soloId = soloId;
        this.prodId = prodId;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hal = hal;
        this.m_o = m_o;
        this.sCmol = sCmol;
        this.ctcCmol = ctcCmol;
        this.vAtual = vAtual;
        this.carbono = carbono;
        this.m_oPer = m_oPer;
    }

    public Solo() {
    }

    public int getProdId() {
        return prodId;
    }

    public int getSoloId() {
        return soloId;
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

    public double getHal() {
        return hal;
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
    
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setSoloId(int soloId) {
        this.soloId = soloId;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }

    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }

    public void setHal(double hal) {
        this.hal = hal;
    }

    public void setM_o(double m_o) {
        this.m_o = m_o;
    }

    public void setsCmol(double sCmol) {
        this.sCmol = sCmol;
    }

    public void setCtcCmol(double ctcCmol) {
        this.ctcCmol = ctcCmol;
    }

    public void setvAtual(double vAtual) {
        this.vAtual = vAtual;
    }

    public void setCarbono(double carbono) {
        this.carbono = carbono;
    }

    public void setM_oPer(double m_oPer) {
        this.m_oPer = m_oPer;
    }

    public void imprimir() {
        System.out.println("Valores do seu solo! \nFosforo: " + fosforo
                + "\nPotassio: " + potassio + "\nCalcio: " + calcio
                + "\nMagnesio: " + magnesio + "\nEnxofre: " + enxofre
                + "\nAluminio: " + aluminio + "\nHal: " + hal
                + "\nMO: " + m_o + "\n");
    }

    //Calculos feitos em 28 linhas de código (Senhor estipulou 40)
    public void calculos() {
        sCmol = potassio + calcio + magnesio;
        ctcCmol = hal + sCmol;
        vAtual = 100 * sCmol / ctcCmol;
        m_oPer = m_o / 10;
        carbono = m_oPer / 1.72 * 10;
    }
    
    public void ideal() {
        switch (soloId) {
            case 1:
                System.out.println("Valores ideais! \nFosforo: 9.0\nPotassio: 0.35"
                        + "\nCalcio: 6.0\nMagnesio: 1.5\nEnxofre: 9.0"
                        + "\nS cmol: " + sCmol + "\nCTC cmol: " + ctcCmol
                        + "\nV% atual: " + vAtual + "\nM.O%: " + m_oPer 
                        + "%\nCarbono: " + carbono + "\n");
                break;
            case 2:
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