package com.mycompany.solo_alysson;

import java.util.ArrayList;

/**
 * @author Alysson Cordeiro
 */
public class BancoSolo {

    private ArrayList<Solo> BDSolo = new ArrayList<Solo>();

    private Solo solo = new Solo();

    public ArrayList<Solo> getBDSolo() {
        return BDSolo;
    }

    public Solo consProdCod(Solo solo) {

        for (int i = 0; i < BDSolo.size(); i++) {
            if (BDSolo.get(i).getProdId() == solo.getProdId()) {
                return BDSolo.get(i);
            }
        }
        return null;
    }
}
