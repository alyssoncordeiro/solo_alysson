package com.mycompany.solo_alysson;

public enum FonteFosforo {

    SUPERFOSFATO_SIMPLES {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(18.0);
        }
    },
    SUPERFOSFATO_TRIPLO {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(41.0);
        }
    },
    MAP {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(48.0);
        }
    },
    DAP {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(45.0);
        }
    },
    YOORIN {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(18.0);
        }
    },
    FOSFATO_NATURAL_DE_ARAD {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(33.0);
        }
    },
    FOSFATO_GAFSA {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(29.0);
        }
    },
    FOSFATO_DAOUI {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(32.0);
        }
    },
    FOSFATO_PATOS_DE_MINAS {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(24.0);
        }
    },
    ESCORIA_DE_THOMAS {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(18.5);
        }
    },
    ACIDO_FOSFORICO {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(52.0);
        }
    },
    MULTIFOSFATO_MAGNESIANO {
        @Override
        public RecuperacaoFosforo calculaTeorPentoxidoDifosforo() {
            return new RecuperacaoFosforo(18.0);
        }
    };

    public abstract RecuperacaoFosforo calculaTeorPentoxidoDifosforo();
}
