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
        
    }

    @Then("düzenleme kaydet butonuna tıkla")
    public void düzenlemeKaydetButonunaTıkla() {
    }
}
