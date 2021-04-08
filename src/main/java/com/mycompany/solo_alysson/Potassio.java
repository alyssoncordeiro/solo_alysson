package com.mycompany.solo_alysson;

public class Potassio {

    String fonte;
    double potassioDesejado, potassioExistente, custo, qtdAplicar, potassioAdicionar, cmolcEmMg, mgEmKg, oxidoPotassio, eficiencia, eficiencia2, precoFontePotassio;
    int teorOxidoPotassio;

    public Potassio(String fonte, double potassioDesejado, double potassioExistente, double custo, double qtdAplicar, double potassioAdicionar, double cmolcEmMg, double mgEmKg, double oxidoPotassio, int teorOxidoPotassio, double eficiencia, double eficiencia2, double precoFontePotassio) {
        this.fonte = fonte;
        this.potassioDesejado = potassioDesejado;
        this.potassioExistente = potassioExistente;
        this.custo = custo;
        this.qtdAplicar = qtdAplicar;
        this.potassioAdicionar = potassioAdicionar;
        this.cmolcEmMg = cmolcEmMg;
        this.mgEmKg = mgEmKg;
        this.oxidoPotassio = oxidoPotassio;
        this.teorOxidoPotassio = teorOxidoPotassio;
        this.eficiencia = eficiencia;
        this.eficiencia2 = eficiencia2;
        this.precoFontePotassio = precoFontePotassio;
    }

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
