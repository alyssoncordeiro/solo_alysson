package com.mycompany.solo_alysson;

public class RecuperacaoFosforo {

    double custo, qtdAplicar, teor, teorAtingir, eficiencia, mgEmKg, pentoxidoDifosforo, pentoxidoDifosforoNecessario, precoFonteFosforo;
    double fonte, nutriente;

    public RecuperacaoFosforo() {
    }

    RecuperacaoFosforo(double fonte, double nutriente) {
        this.fonte = fonte;
        this.nutriente = nutriente;
    }

    public double getFonte() {
        return fonte;
    }
    
    public double getNutriente() {
        return nutriente;
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

    public double forneceNutriente(double qtdAplicar, double nutriente) {
        return qtdAplicar * nutriente;
    }
}
