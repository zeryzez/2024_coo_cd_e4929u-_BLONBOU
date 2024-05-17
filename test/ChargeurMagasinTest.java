package test;
import XML.ChargeurMagasin;
import org.junit.*;

import java.io.FileNotFoundException;

public class ChargeurMagasinTest {

    private static final VALID_PATH = "O:\Bureau\2024_coo_cd_e4929u-_BLONBOU\musicbrainzSimple"
    private static final INVALID_PATH = "O:\Bureau\2024_coo_cd_e4929u-_BLONBOU\donnees"

    @Test
    public void test_ChargeurMagasin_chargerMagasin_valide(){
        ChargeurMagasin cm = new ChargeurMagasin(VALID_PATH);
        try{
            Magasin m = cm.chargerMagasin();
        }catch(FileNotFoundException e){

        }
    }

    @Test
    public void test_ChargeurMagasin_chargerMagasin_invalide(){

    }




}
