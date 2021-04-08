package com.mycompany.solo_alysson;

public class RecuperacaoPotassio {

    String fonte;
    double potassioDesejado, potassioExistente, custo, qtdAplicar, potassioAdicionar, cmolcEmMg, mgEmKg, oxidoPotassio, eficiencia, eficiencia2, precoFontePotassio;
    int teorOxidoPotassio;

    public RecuperacaoPotassio() {
    }

    public double calculaPotassioExistente(double potassio, double CTCcmol) {
        return potassioExistente = potassio / CTCcmol * 100;
    }

    public double calculaPotassioAdicionar(double potassio, double potassioExistente, double potassioDesejado) {
        return potassioAdicionar = potassio * potassioDesejado / potassioExistente - potassio;
    }

    public double converteCmolcEmMg(double potassioAdicionar) {
        return cmolcEmMg = potassioAdicionar * 39.1 * 10;
    }

    public double converteMgEmKg(double cmolcEmMg) {
        return mgEmKg = cmolcEmMg * 2;
    }

    public double convertePotassioEmOxidoPotassio(double mgEmKg) {
        return oxidoPotassio = mgEmKg * 1.2;
    }

    public double calculaEficiênciaPotassio(double oxidoPotassio, double eficiencia) {
        return eficiencia2 = oxidoPotassio * 100 / eficiencia;
    }

    public double calculaQtdAplicarFontePotassio(double eficiencia2, int teorOxidoPotassio) {
        return qtdAplicar = eficiencia2 * 100 / teorOxidoPotassio;
    }

    public double calculaCustoAplicacao(double precoFontePotassio, double qtdAplicar) {
        return custo = precoFontePotassio * qtdAplicar / 1000;
    }

    public String verificaTeorOxidoPotassio(int teorOxidoPotassio) {
        switch (teorOxidoPotassio) {
            case 58:
                return "Cloreto de Potassio";
            case 52:
                return "Sulfato de Potassio";
            case 22:
                return "Sulfato de Potassio / Magnesio";
            default:
                return "Fonte de Potassio Invalida";
        }
    }
}
