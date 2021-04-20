package com.mycompany.solo_alysson;

public enum FonteFosforo {

    SUPERFOSFATO_SIMPLES {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(18.0, 0.1, 0.0, 0.0, 0.28);
        }
    ;
    },
    SUPERFOSFATO_TRIPLO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(41.0, 0.0, 0.0, 0.0, 0.2);
        }
    ;
    },
    MAP {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(48.0, 0.0, 0.09, 0.0, 0.0);
        }
    ;
    },
    DAP {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(45.0, 0.0, 0.16, 0.0, 0.0);
        }
    ;
    },
    YOORIN {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(18.0, 0.0, 0.0, 0.15, 0.28);
        }
    ;
    },
    FOSFATO_NATURAL_DE_ARAD {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(33.0, 0.0, 0.0, 0.0, 0.52);
        }
    ;
    },
    FOSFATO_GAFSA {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(29.0, 0.0, 0.0, 0.0, 0.52);
        }
    ;
    },
    FOSFATO_DAOUI {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(32.0, 0.0, 0.0, 0.0, 0.45);
        }
    ;
    },
    FOSFATO_PATOS_DE_MINAS {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(24.0, 0.0, 0.0, 0.0, 0.28);
        }
    ;
    },
    ESCORIA_DE_THOMAS {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(18.5, 0.0, 0.0, 0.0, 0.44);
        }
    ;
    },
    ACIDO_FOSFORICO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(52.0, 0.0, 0.0, 0.0, 0.0);
        }
    ;
    },
    MULTIFOSFATO_MAGNESIANO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            return new RecuperacaoFosforo(18.0, 0.11, 0.0, 0.0, 0.18);
        }
    ;
    };

    public abstract RecuperacaoFosforo verificaFonteFosforo();

}
