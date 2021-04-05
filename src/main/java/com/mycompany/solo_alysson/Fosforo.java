package com.mycompany.solo_alysson;

public class Fosforo extends Solo {

    String fonte;
    double custo, qtdAplicar, teor, eficiencia, necessidadeAdicionar, pentoxidoDifosforo, pentoxidoDifosforoNecessario, precoFonteFosforo;

    public Fosforo() {
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

    public double getNecessidadeAdicionar() {
        return necessidadeAdicionar;
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

    @Override
    public void calculos() {
        teor -= super.fosforo;
        necessidadeAdicionar = teor * 2;
        pentoxidoDifosforo = necessidadeAdicionar * 2.29;
        pentoxidoDifosforoNecessario = pentoxidoDifosforo * 100 / eficiencia;
        qtdAplicar = pentoxidoDifosforoNecessario * 100 / 18;
        custo = precoFonteFosforo * qtdAplicar / 1000;
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
