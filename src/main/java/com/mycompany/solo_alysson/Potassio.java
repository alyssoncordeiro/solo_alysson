package com.mycompany.solo_alysson;

public class Potassio {

    String fonte;
    double potassioDesejada, custo, qtdAplicar;

    public Potassio(String fonte, double potassioDesejada, double custo, double qtdAplicar) {
        this.fonte = fonte;
        this.potassioDesejada = potassioDesejada;
        this.custo = custo;
        this.qtdAplicar = qtdAplicar;
    }

    public String getFonte() {
        return fonte;
    }

    public double getPotassioDesejada() {
        return potassioDesejada;
    }

    public double getCusto() {
        return custo;
    }

    public double getQtdAplicar() {
        return qtdAplicar;
    }

    public void recuperacao() {
        switch (fonte) {
            case "Cloreto de Potassio":
                System.out.println("Quantidade a aplicar: " + qtdAplicar + "kg/hectare\nCusto - R$/ha " + custo);
                break;
            default:
                System.out.println("Fonte de Potassio incorreta");
                break;
        }
    }
}
