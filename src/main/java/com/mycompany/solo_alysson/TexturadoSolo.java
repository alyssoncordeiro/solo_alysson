package com.mycompany.solo_alysson;

public enum TexturadoSolo {

    ARGILOSO {
        @Override
        public Nutrientes calculaValorIdeal() {
            return new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
        }
    },
    TEXTURA_MEDIA {
        @Override
        public Nutrientes calculaValorIdeal() {
            return new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
        }
    };

    public abstract Nutrientes calculaValorIdeal();
}
