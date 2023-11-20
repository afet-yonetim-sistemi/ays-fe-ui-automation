package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOS_Assignments_POM;

public class AYOS_Assignments_Show {
    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("göster butonu olan göz simgesine tıkla")
    public void gösterButonuOlanGözSimgesineTıkla() {
        ayo.clickMethod(ayo.getShow());
    }

    @Then("atama bilgilerinin geldiğini doğrula")
    public void atamaBilgilerininGeldiğiniDoğrula() {
        ayo.waitUntilVisible(ayo.getValidateShow());
        Assert.assertTrue(ayo.getValidateShow().isDisplayed());
    }
}
