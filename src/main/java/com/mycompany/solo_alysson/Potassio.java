package com.mycompany.solo_alysson;

public class Potassio extends Solo {

    String fonte;
    double potassioDesejado, potassioExistente, custo, qtdAplicar, potassioAdicionar, cmolcEmMg, mgEmKg, oxidoPotassio, teorOxidoPotassio, eficiencia, eficiencia2, precoFontePotassio;

    public Potassio() {

    }

    public String getFonte() {
        return fonte;
    }

    public double getPotassioDesejado() {
        return potassioDesejado;
    }

    public double getPotassioExistente() {
        return potassioExistente;
    }

    public double getCusto() {
        return custo;
    }

    public double getQtdAplicar() {
        return qtdAplicar;
    }

    public double getPotassioAdicionar() {
        return potassioAdicionar;
    }

    public double getCmolcEmMg() {
        return cmolcEmMg;
    }

    public double getMgEmKg() {
        return mgEmKg;
    }

    public double getOxidoPotassio() {
        return oxidoPotassio;
    }

    public double getTeorOxidoPotassio() {
        return teorOxidoPotassio;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public double getEficiencia2() {
        return eficiencia2;
    }

    public double getPrecoFontePotassio() {
        return precoFontePotassio;
    }

    @Override
    public void calculos() {
        potassioExistente = super.potassio / super.ctcCmol * 100;
        potassioAdicionar = super.potassio * potassioDesejado / potassioExistente - super.potassio;
        cmolcEmMg = potassioAdicionar * 39.1 * 10;
        mgEmKg = cmolcEmMg * 2;
        oxidoPotassio = mgEmKg * 1.2;
        eficiencia2 = oxidoPotassio * 100 / eficiencia;
        qtdAplicar = eficiencia2 * 100 / teorOxidoPotassio;
        custo = precoFontePotassio * qtdAplicar / 1000;
    }

    public void verificaTeorOxidoPotassio() {
        switch (fonte) {
            case "Cloreto de Potassio":
                teorOxidoPotassio = 58.0;
                break;
            case "Sulfato de Potassio":
                teorOxidoPotassio = 52.0;
                break;
            case "Sulfato de Potassio / Magnesio":
                teorOxidoPotassio = 22;
                break;
            default:
                System.out.println("Fonte de Potassio incorreta");
                break;
        }
    }

    public void recuperacao() {
        switch (fonte) {
            case "Cloreto de Potassio":
                System.out.println("Quantidade de Cloreto de Potassio a aplicar: " + qtdAplicar + " kg/hectare\nCusto/hectare: R$" + custo);
                break;
            case "Sulfato de Potassio":
                System.out.println("Quantidade de Sulfato de Potassio a aplicar: " + qtdAplicar + " kg/hectare\nCusto/hectare: R$" + custo);
                break;
            case "Sulfato de Potassio / Magnesio":
                System.out.println("Quantidade de Sulfatdo de Potassio / Magnesio a aplicar: " + qtdAplicar + " kg/hectare\nCusto/hectare: R$" + custo);
                break;
            default:
                System.out.println("Fonte de Potassio incorreta");
                break;
        }
    }
}
