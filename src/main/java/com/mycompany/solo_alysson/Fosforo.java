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
public class Fosforo {

    int teor, eficiencia;
    String fonte;
    double custo, qtdAplicar, enxofre, calcio;

    public Fosforo(int teor, int eficiencia, String fonte) {
        this.teor = teor;
        this.eficiencia = eficiencia;
        this.fonte = fonte;
    }

    public int getTeor() {
        return teor;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public String getFonte() {
        return fonte;
    }

}
