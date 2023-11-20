package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AYOS_Assignments_POM;

public class Assignments_Edit {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("düzenleme butonu olan kalem simgesine tıkla")
    public void düzenlemeButonuOlanKalemSimgesineTıkla() {
        ayo.clickMethod(ayo.getDuzenle().get(0));
    }

    @And("atama formunudaki her inputu düzenle")
    public void atamaFormunudakiHerInputuDüzenle() {
        ayo.getAd().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getAd(), "ABCDE");

        ayo.getSoyad().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getSoyad(), "ABCDE");

        ayo.getAciklama().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getAciklama(), "ABCDE");

        ayo.clickMethod(ayo.getAlanKodu());
        ayo.clickMethod(ayo.getTurkiyeAlanKodu());

        ayo.getTelefonNumarasi().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "11");




    }

    @Then("düzenleme kaydet butonuna tıkla")
    public void düzenlemeKaydetButonunaTıkla() {
        ayo.clickMethod(ayo.getAtamayiKaydet());
    }
}
