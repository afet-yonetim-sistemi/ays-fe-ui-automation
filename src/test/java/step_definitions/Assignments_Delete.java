package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOS_Assignments_POM;

public class Assignments_Delete {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("en üstteki atama için çöp kutusu butonuna tıkla")
    public void enÜsttekiAtamaIçinÇöpKutusuButonunaTıkla() {
        ayo.clickMethod(ayo.getAtamayiSil());
    }

    @And("sil butonuna tıkla")
    public void silButonunaTıkla() {
     ayo.clickMethod(ayo.getAtamayiSilEminMisiniz());

    }

    @Then("başarı mesajını doğrula")
    public void başarıMesajınıDoğrula() {
    ayo.waitUntilVisible(ayo.getSilBasariMesaji());
    Assert.assertTrue(ayo.getSilBasariMesaji().isDisplayed());
    }
}
