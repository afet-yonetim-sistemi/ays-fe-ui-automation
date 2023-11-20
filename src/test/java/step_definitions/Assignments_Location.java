package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOS_Assignments_POM;

public class Assignments_Location {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("en üstteki atama için konum işareti butonuna tıkla")
    public void enÜsttekiAtamaIçinKonumIşaretiButonunaTıkla() {
        ayo.clickMethod(ayo.getKonumGoruntule());
    }

    @Then("gelen konumun görüntülendiğini doğrula")
    public void gelenKonumunGörüntülendiğiniDoğrula() {
        ayo.waitUntilVisible(ayo.getKonumDogrula());
        Assert.assertTrue(ayo.getKonumDogrula().isDisplayed());
    }

    @Then("açılan pencerelerde google haritalarda aç")
    public void açılanPencerelerdeGoogleHaritalardaAç() {
        ayo.clickMethod(ayo.getGoogleHaritalardaAc());
    }

    @Then("gelen konumun detaylarını kopyala butonuna tıkla")
    public void gelenKonumunDetaylarınıKopyalaButonunaTıkla() {
        ayo.clickMethod(ayo.getKonumuBilgileriniKopyala());
    }

    @Then("gelen konumu telefonda aç butonuna tıkla")
    public void gelenKonumuTelefondaAçButonunaTıkla() {
        ayo.clickMethod(ayo.getTelefonumdaAc());

    }
}
