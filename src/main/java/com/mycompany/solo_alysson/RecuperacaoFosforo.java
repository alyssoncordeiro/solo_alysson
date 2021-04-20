package com.mycompany.solo_alysson;

public class RecuperacaoFosforo {

    double custo, qtdAplicar, teor, teorAtingir, eficiencia, mgEmKg, pentoxidoDifosforo, pentoxidoDifosforoNecessario, precoFonteFosforo;
    double nitrogenio, fonte, enxofre, calcio, magnesio;

    public RecuperacaoFosforo() {
    }

    RecuperacaoFosforo(double fonte, double enxofre, double nitrogenio, double magnesio, double calcio) {
        this.fonte = fonte;
        this.enxofre = enxofre;
        this.nitrogenio = nitrogenio;
        this.magnesio = magnesio;
        this.calcio = calcio;
    }

    public double getNitrogenio() {
        return nitrogenio;
    }

    public double getFonte() {
        return fonte;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
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

    public double calculaQtdFosforoAplicar(double pentoxidoDifosforoNecessario, double fonte) {
        return qtdAplicar = pentoxidoDifosforoNecessario * 100 / fonte;
    }

    public double calculaCusto(double precoFonteFosforo, double qtdAplicar) {
        return custo = precoFonteFosforo * qtdAplicar / 1000;
    }

    public double forneceEnxofre(double qtdAplicar, double enxofre) {
        return qtdAplicar * enxofre;
    }

    public double forneceNitrogenio(double qtdAplicar, double nitrogenio) {
        return qtdAplicar * nitrogenio;
    }

    public double forneceMagnesio(double qtdAplicar, double magnesio) {
        return qtdAplicar * magnesio;
    }

    public double forneceCalcio(double qtdAplicar, double calcio) {
        return qtdAplicar * calcio;
    }
}
