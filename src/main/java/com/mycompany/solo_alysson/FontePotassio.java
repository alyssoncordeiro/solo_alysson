package com.mycompany.solo_alysson;

public enum FontePotassio {
    
    CLORETO_DE_POTASSIO {
        @Override
        public RecuperacaoPotassio verificaFontePotassio() {
            return new RecuperacaoPotassio(58.0);
        }
    },
    SULFATO_DE_POTASSIO {
        @Override
        public RecuperacaoPotassio verificaFontePotassio() {
            return new RecuperacaoPotassio(52.0);
        }
    },
    SULFATO_DE_POTASSIO_E_MAGNESIO {
        @Override
        public RecuperacaoPotassio verificaFontePotassio() {
            return new RecuperacaoPotassio(22.0);
        }
    };
    
    public abstract RecuperacaoPotassio verificaFontePotassio();
}
