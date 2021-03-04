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
public class SoloIdeal extends Solo {

    double sCmol, ctcCmol, vAtual, carbono, m_oPer;

    public SoloIdeal(double sCmol, double ctcCmol, double vAtual, double carbono,
            double m_oPer, int prodId, int soloId, double fosforo, double potassio,
            double calcio, double magnesio, double enxofre, double aluminio, double hal, double m_o) {
        super(prodId, soloId, fosforo, potassio, calcio, magnesio, enxofre, aluminio, hal, m_o);
        this.sCmol = sCmol;
        this.ctcCmol = ctcCmol;
        this.vAtual = vAtual;
        this.carbono = carbono;
        this.m_oPer = m_oPer;
    }

    public SoloIdeal() {

    }

    public double calcularSCmol(double potassio, double calcio, double magnesio) {
        return sCmol = super.potassio + super.calcio + super.magnesio;
    }

    public double calcularCtcCmol(double hal, double sCmol) {
        ctcCmol = super.hal + sCmol;
        if (ctcCmol > 0.1) {
            return ctcCmol;
        } else {
            return 0;
        }
    }

    public double calcularVAtual(double ctcCmol, double sCmol) {
        vAtual = 100 * sCmol + ctcCmol;
        return vAtual;
    }
    
    public double calcularMOPer(double m_o){
        m_oPer = m_o / 10;
        return m_oPer;
    }
    
    public double calcularCarbono(double m_oPer){
        carbono = m_oPer / 1.72 * 10;
        return carbono;
    }
}
