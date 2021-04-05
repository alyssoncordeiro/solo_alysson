package com.mycompany.solo_alysson;

public class Main { //Classe destinada ao teste dos cálculos do solo!

    public static void main(String args[]) {
        Solo s1 = new Solo();
        Fosforo f1 = new Fosforo();
        Potassio p1 = new Potassio();
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
        f1.fosforo = s1.fosforo;
        f1.precoFonteFosforo = 1260.0; //valor do preço do Teor de Fosforo
        f1.teor = 12; //teor desejado atingir
        f1.fonte = "Superfosfato simples";
        f1.eficiencia = 70.0; //eficiencia de 70% a 90%
        f1.calculos();
        f1.recuperacao();
        p1.ctcCmol = s1.ctcCmol;
        p1.potassio = s1.potassio;
        p1.potassioDesejado = 3.0;
        p1.fonte = "Cloreto de Potassio";
        p1.eficiencia = 85.0;
        p1.precoFontePotassio = 2500.0;
        p1.verificaTeorOxidoPotassio();
        p1.calculos();
        p1.recuperacao();

    }
}
