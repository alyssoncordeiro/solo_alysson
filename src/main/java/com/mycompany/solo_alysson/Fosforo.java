package com.mycompany.solo_alysson;

public class Fosforo {

    String fonte;
    double custo, qtdAplicar, enxofre, calcio, teor, eficiencia;;

    public Fosforo(int teor, int eficiencia, String fonte) {
        this.teor = teor;
        this.eficiencia = eficiencia;
        this.fonte = fonte;
    }

    public Fosforo() {
    }

    public double getTeor() {
        return teor;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public String getFonte() {
        return fonte;
    }

    public void calculos() {
        qtdAplicar = 22.31 * 100 / 18;
        custo = 1260 * qtdAplicar / 1000;
    }

    public void recuperacao() {
        switch (fonte) {
            case "Superfosfato simples":
                System.out.println("Quantidade de Superfosfato simples a aplicar: " + qtdAplicar + " kg/hectare\nCusto/hectare: R$" + custo);
                break;
            default:
                System.out.println("Fonte de Fosforo incorreta");
                break;
        }
    }
}
