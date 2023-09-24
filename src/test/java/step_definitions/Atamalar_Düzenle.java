package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AYOS_Atamalar_POM;

public class Atamalar_Düzenle {

    AYOS_Atamalar_POM ayo =new AYOS_Atamalar_POM();
    @And("düzenleme butonu olan kalem simgesine tıkla")
    public void düzenlemeButonuOlanKalemSimgesineTıkla() {
        ayo.clickMethod(ayo.getDuzenle());
    }

    @And("atama formunudaki her inputu düzenle")
    public void atamaFormunudakiHerInputuDüzenle() {
        ayo.sendKeysMethod(ayo.getAd(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyad(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklama(), "abcdfghh");
        ayo.clickMethod(ayo.getAlanKodu());
        // ayo.clickMethod(ayo.gettu);
        //    ayo.clickMethod(ayo.getTurkceDilSecenegi());
        // ayo.sendKeysMethod(ayo.getAlanKodu(), " ");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "");
        ayo.sendKeysMethod(ayo.getEnlem(), "41");
        ayo.sendKeysMethod(ayo.getBoylam(), "37");
    }

    @Then("düzenleme kaydet butonuna tıkla")
    public void düzenlemeKaydetButonunaTıkla() {
        ayo.clickMethod(ayo.getAtamayiKaydet());
    }
}
