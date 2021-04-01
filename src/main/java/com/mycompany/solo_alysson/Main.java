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
public class Main { //Classe destinada ao teste dos cálculos do solo!

    public static void main(String args[]) {
        Solo s1 = new Solo();
        System.out.println("Exemplo1");
        s1.soloTipo = "argiloso"; // Tipo de solo (argiloso e textura media)
        s1.fosforo = 8.59;
        s1.potassio = 0.15;
        s1.calcio = 5.76;
        s1.magnesio = 1.63;
        s1.enxofre = 3.67;
        s1.aluminio = 0.0;
        s1.aluminioHidrogenio = 5.35;
        s1.m_o = 30.7;
        s1.imprimir();//Imprime os valores do solo
        s1.calculos(); // efetua alguns calculos
        s1.ideal();//Imprime os valores considerados ideais de cada item
        
        System.out.println("Exemplo2");
        s1.soloTipo = "argiloso";
        s1.fosforo = 10.58;
        s1.potassio = 0.41;
        s1.calcio = 6.94;
        s1.magnesio = 2.87;
        s1.enxofre = 2.31;
        s1.aluminio = 0.0;
        s1.aluminioHidrogenio = 4.28;
        s1.m_o = 30.7;
        s1.imprimir();
        s1.calculos();
        s1.ideal();

        System.out.println("Exemplo3");
        s1.soloTipo = "argiloso";
        s1.fosforo = 10.23;
        s1.potassio = 0.82;
        s1.calcio = 12.45;
        s1.magnesio = 3.47;
        s1.enxofre = 1.10;
        s1.aluminio = 0.0;
        s1.aluminioHidrogenio = 5.15;
        s1.m_o = 30.7;
        s1.imprimir();
        s1.calculos();
        s1.ideal();

    }
}
