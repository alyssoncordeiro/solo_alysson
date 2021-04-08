package com.mycompany.solo_alysson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {

    @Test
    public void testaCalculaSCmol() {
        assertEquals(7.54,
                new Nutrientes().calculaSCmol(0.15, 5.76, 1.63));

    }

    @Test
    public void testaCalculaCTCCmol() {
        assertEquals(12.89,
                new Nutrientes().calculaCTCCmol(5.35, 7.54));
    }

    @Test
    public void testaVPercentual() {
        assertEquals(58.494957331264544,
                new Nutrientes().calculaVPercentual(
                        new Nutrientes().calculaSCmol(0.15, 5.76, 1.63),
                        new Nutrientes().calculaCTCCmol(5.35, 7.54)
                )
        );
    }

    @Test
    public void testaMOPercentual() {
        assertEquals(3.07, new Nutrientes().calculaMOPercentual(30.7));
    }

    @Test
    public void testaCalculaCarbono() {
        assertEquals(17.848837209302324,
                new Nutrientes().calculaCarbono(
                        new Nutrientes().calculaMOPercentual(30.7)
                )
        );
    }

    @Test
    public void testaCalculaPotassioExistente() {
        assertEquals(1.1636927851047323,
                new Potassio().calculaPotassioExistente(0.15,
                        new Nutrientes().calculaCTCCmol(5.35, 7.54))
        );
    }

    @Test
    public void testaCalculaPotassioAdicionar() {
        assertEquals(0.2367,
                new Potassio().calculaPotassioAdicionar(0.15, 1.1636927851047323, 3.0)
        );
    }

    @Test
    public void testaConverteCmolcEmMg() {
        assertEquals(92.5497,
                new Potassio().converteCmolcEmMg(0.2367)
        );
    }

    @Test
    public void testaConverteMgEmKg() {
        assertEquals(185.0994,
                new Potassio().converteMgEmKg(92.5497)
        );
    }

    @Test
    public void testaConvertePotassioEmOxidoPotassio() {
        assertEquals(222.11928,
                new Potassio().convertePotassioEmOxidoPotassio(185.0994)
        );
    }

    @Test
    public void testaCalculaEficiênciaPotassio() {
        assertEquals(261.3168,
                new Potassio().calculaEficiênciaPotassio(222.11928, 85)
        );
    }

    @Test
    public void testaCalculaQtdAplicarFontePotassio() {
        assertEquals(450.5462068965517,
                new Potassio().calculaQtdAplicarFontePotassio(261.3168, 58)
        );
    }

    @Test
    public void testaCalculaCustoAplicacao() {
        assertEquals(1126.3655172413792,
                new Potassio().calculaCustoAplicacao(2500.00, 450.5462068965517)
        );
    }

    @Test
    public void testaVerificaTeorOxidoPotassio() {
        assertEquals("Cloreto de Potassio",
                new Potassio().verificaTeorOxidoPotassio(58));
        assertEquals("Sulfato de Potassio",
                new Potassio().verificaTeorOxidoPotassio(52));
        assertEquals("Sulfato de Potassio / Magnesio",
                new Potassio().verificaTeorOxidoPotassio(22)
        );
    }

    @Test
    public void testaCalculaTeorAtingir() {
        assertEquals(3.41,
                new Fosforo().calculaTeorAtingir(8.59, 12.0)
        );
    }

    @Test
    public void testaConverteFosforoMgEmKg() {
        assertEquals(6.82,
                new Fosforo().converteMgEmKg(3.41)
        );
    }

    @Test
    public void testaPotassioEmPentoxidoDifosforo() {
        assertEquals(15.6178,
                new Fosforo().potassioEmPentoxidoDifosforo(6.82)
        );
    }

    @Test
    public void testaCalculaPentoxidoDiFosforoNecessario() {
        assertEquals(22.31114285714286,
                new Fosforo().calculaPentoxidoDiFosforoNecessario(15.6178, 70.0)
        );
    }

    @Test
    public void testaCalculaQtdFosforoAplicar() {
        assertEquals(123.95079365079366,
                new Fosforo().calculaQtdFosforoAplicar(22.31114285714286)
        );
    }

    @Test
    public void testaCusto() {
        assertEquals(156.178,
                new Fosforo().calculaCusto(1260.0, 123.95079365079366)
        );
    }
}
