package com.mycompany.solo_alysson;

public enum FonteFosforo {
    SUPERFOSFATO_SIMPLES {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 18.0;
            double nutrientes[] = {0.1, 0.28}; //Enxofre e Calcio)          
            for(int i = 0; i<nutrientes.length; i++){
                return new RecuperacaoFosforo(teor, nutrientes[i]);
            }
            return new RecuperacaoFosforo(teor, nutrientes.length);
        }
    ;
    },
    SUPERFOSFATO_TRIPLO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 41.0;
            double calcio = 0.2;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    MAP {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 48.0;
            double nitrogenio = 0.09;
            return new RecuperacaoFosforo(teor, nitrogenio);
        }
    ;
    },
    DAP {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 45.0;
            double nitrogenio = 0.16;
            return new RecuperacaoFosforo(teor, nitrogenio);
        }
    ;
    },
    YOORIN {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 18.0;
            double nutrientes[] = {0.15, 0.28}; //Calcio e Magnesio)
            for(int i = 0; i<nutrientes.length; i++){
                return new RecuperacaoFosforo(teor, nutrientes[i]);
            }
            return new RecuperacaoFosforo(teor, nutrientes.length);
        }
    ;
    },
    FOSFATO_NATURAL_DE_ARAD {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 33.0;
            double calcio = 0.52;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    FOSFATO_GAFSA {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 29.0;
            double calcio = 0.52;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    FOSFATO_DAOUI {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 32.0;
            double calcio = 0.45;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    FOSFATO_PATOS_DE_MINAS {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 24.0;
            double calcio = 0.28;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    ESCORIA_DE_THOMAS {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 18.5;
            double calcio = 0.44;
            return new RecuperacaoFosforo(teor, calcio);
        }
    ;
    },
    ACIDO_FOSFORICO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 52.0;
            return new RecuperacaoFosforo(teor, 0.0);
        }
    ;
    },
    MULTIFOSFATO_MAGNESIANO {
        @Override
        public RecuperacaoFosforo verificaFonteFosforo() {
            double teor = 18.0;
            double nutrientes[] = {0.11, 0.18}; //Enxofre e Calcio)
            for(int i = 0; i<nutrientes.length; i++){
                return new RecuperacaoFosforo(teor, nutrientes[i]);
            }
            return new RecuperacaoFosforo(teor, nutrientes.length);
        }
    ;

    };

    public abstract RecuperacaoFosforo verificaFonteFosforo();

}
