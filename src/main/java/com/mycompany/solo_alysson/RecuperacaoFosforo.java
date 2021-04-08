package com.mycompany.solo_alysson;

public class RecuperacaoFosforo {

    String fonte;
    double custo, qtdAplicar, teor, teorAtingir, eficiencia, mgEmKg, pentoxidoDifosforo, pentoxidoDifosforoNecessario, precoFonteFosforo;

    public RecuperacaoFosforo() {
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
