package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOS_Atamalar_POM;

public class AYOS_Atamalar_Göster {
    AYOS_Atamalar_POM ayo =new AYOS_Atamalar_POM();
    @And("göster butonu olan göz simgesine tıkla")
    public void gösterButonuOlanGözSimgesineTıkla() {
        ayo.clickMethod(ayo.getGoster());
    }

    @Then("atama bilgilerinin geldiğini doğrula")
    public void atamaBilgilerininGeldiğiniDoğrula() {
        ayo.waitUntilVisible(ayo.getGosterDogrulama());
        Assert.assertTrue(ayo.getGosterDogrulama().isDisplayed());
    }
}
