package com.mycompany.solo_alysson;

public class Fosforo {

    String fonte;
    double custo, qtdAplicar, teor, teorAtingir, eficiencia, mgEmKg, pentoxidoDifosforo, pentoxidoDifosforoNecessario, precoFonteFosforo;

    public Fosforo() {
    }

    public double getTeorAtingir() {
        return teorAtingir;
    }

    public String getFonte() {
        return fonte;
    }

    public double getCusto() {
        return custo;
    }

    public double getQtdAplicar() {
        return qtdAplicar;
    }

    public double getTeor() {
        return teor;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public double getMgEmKg() {
        return mgEmKg;
    }

    public double getPentoxidoDifosforo() {
        return pentoxidoDifosforo;
    }

    public double getPentoxidoDifosforoNecessario() {
        return pentoxidoDifosforoNecessario;
    }

    public double getPrecoFonteFosforo() {
        return precoFonteFosforo;
    }

    public double calculaTeorAtingir(double fosforo, double teor) {
        return teorAtingir = teor - fosforo;
    }

    public double converteMgEmKg(double teorAtingir) {
        return mgEmKg = teorAtingir * 2;
    }

    public double potassioEmPentoxidoDifosforo(double mgEmKg) {
        return pentoxidoDifosforo = mgEmKg * 2.29;
    }

    public double calculaPentoxidoDiFosforoNecessario(double pentoxidoDifosforo, double eficiencia) {
        return pentoxidoDifosforoNecessario = pentoxidoDifosforo * 100 / eficiencia;
    }

    public double calculaQtdFosforoAplicar(double pentoxidoDifosforoNecessario) {
        return qtdAplicar = pentoxidoDifosforoNecessario * 100 / 18;
    }

    public double calculaCusto(double precoFonteFosforo, double qtdAplicar) {
        return custo = precoFonteFosforo * qtdAplicar / 1000;
    }
}
