package com.mycompany.solo_alysson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {

    @Test
    public void testaValoresIdeaisArgiloso() {
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getFosforo());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getAluminio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getCalcio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getEnxofre());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getMagnesio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                TexturadoSolo.ARGILOSO.calculaValorIdeal().getPotassio());
    }

    @Test
    public void testaValoresIdeaisTexturaMedia() {
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getFosforo(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getFosforo());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getCalcio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getEnxofre());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getMagnesio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                TexturadoSolo.TEXTURA_MEDIA.calculaValorIdeal().getPotassio());

    }
    
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
                new RecuperacaoPotassio().calculaPotassioExistente(0.15,
                        new Nutrientes().calculaCTCCmol(5.35, 7.54))
        );
    }

    @Test
    public void testaCalculaPotassioAdicionar() {
        assertEquals(0.2367,
                new RecuperacaoPotassio().calculaPotassioAdicionar(0.15, 1.1636927851047323, 3.0)
        );
    }

    @Test
    public void testaConverteCmolcEmMg() {
        assertEquals(92.5497,
                new RecuperacaoPotassio().converteCmolcEmMg(0.2367)
        );
    }

    @Test
    public void testaConverteMgEmKg() {
        assertEquals(185.0994,
                new RecuperacaoPotassio().converteMgEmKg(92.5497)
        );
    }

    @Test
    public void testaConvertePotassioEmOxidoPotassio() {
        assertEquals(222.11928,
                new RecuperacaoPotassio().convertePotassioEmOxidoPotassio(185.0994)
        );
    }

    @Test
    public void testaCalculaEficiênciaPotassio() {
        assertEquals(261.3168,
                new RecuperacaoPotassio().calculaEficiênciaPotassio(222.11928, 85)
        );
    }

    @Test
    public void testaCalculaQtdAplicarFontePotassio() {
        assertEquals(450.5462068965517,
                new RecuperacaoPotassio().calculaQtdAplicarFontePotassio(261.3168, 58)
        );
    }

    @Test
    public void testaCalculaCustoAplicacao() {
        assertEquals(1126.3655172413792,
                new RecuperacaoPotassio().calculaCustoAplicacao(2500.00, 450.5462068965517)
        );
    }

    @Test
    public void testaVerificaTeorOxidoPotassio() {
        assertEquals("Cloreto de Potassio",
                new RecuperacaoPotassio().verificaTeorOxidoPotassio(58));
        assertEquals("Sulfato de Potassio",
                new RecuperacaoPotassio().verificaTeorOxidoPotassio(52));
        assertEquals("Sulfato de Potassio / Magnesio",
                new RecuperacaoPotassio().verificaTeorOxidoPotassio(22)
        );
    }

    @Test
    public void testaCalculaTeorAtingir() {
        assertEquals(3.41,
                new RecuperacaoFosforo().calculaTeorAtingir(8.59, 12.0)
        );
    }

    @Test
    public void testaConverteFosforoMgEmKg() {
        assertEquals(6.82,
                new RecuperacaoFosforo().converteMgEmKg(3.41)
        );
    }

    @Test
    public void testaPotassioEmPentoxidoDifosforo() {
        assertEquals(15.6178,
                new RecuperacaoFosforo().potassioEmPentoxidoDifosforo(6.82)
        );
    }

    @Test
    public void testaCalculaPentoxidoDiFosforoNecessario() {
        assertEquals(22.31114285714286,
                new RecuperacaoFosforo().calculaPentoxidoDiFosforoNecessario(15.6178, 70.0)
        );
    }

    @Test
    public void testaCalculaQtdFosforoAplicar() {
        assertEquals(123.95079365079366,
                new RecuperacaoFosforo().calculaQtdFosforoAplicar(22.31114285714286)
        );
    }

    @Test
    public void testaCusto() {
        assertEquals(156.178,
                new RecuperacaoFosforo().calculaCusto(1260.0, 123.95079365079366)
        );
    }
}
