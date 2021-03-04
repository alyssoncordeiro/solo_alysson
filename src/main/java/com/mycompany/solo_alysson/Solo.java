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
    int soloId;
    double fosforo, potassio, calcio, magnesio, enxofre, aluminio, hal;
    double sCmol, ctcCmol, vAtual;

    public Solo(int soloId, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double hal) {
        this.soloId = soloId;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hal = hal;
    }

    public Solo() {
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

    @Override
    public String toString() {
        return "Solo{" + "soloId=" + soloId + ", fosforo=" + fosforo + 
                ", potassio=" + potassio + ", calcio=" + calcio + ", magnesio=" 
                + magnesio + ", enxofre=" + enxofre + ", aluminio=" + aluminio + 
                ", hal=" + hal + '}';
    }

    public void calcular(){

    }
}
