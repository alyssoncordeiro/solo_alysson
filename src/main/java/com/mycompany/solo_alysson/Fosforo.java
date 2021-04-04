package com.mycompany.solo_alysson;

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

    public void calculos() {

    }

    public void recuperacao() {
        switch (fonte) {
            case "Superfosfato simples":
                System.out.println("Quantidade a aplicar: " + qtdAplicar + "kg/hectare\nCusto - R$/ha " + custo);
                break;
            default:
                System.out.println("Fonte de Fosforo incorreta");
                break;
        }
    }
}
