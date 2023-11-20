package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AYOS_Assignments_POM;

public class Assignments_Edit {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("düzenleme butonu olan kalem simgesine tıkla")
    public void düzenlemeButonuOlanKalemSimgesineTıkla() {
        ayo.clickMethod(ayo.getEdit().get(0));
    }

    @And("atama formunudaki her inputu düzenle")
    public void atamaFormunudakiHerInputuDüzenle() {
        ayo.getName().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getName(), "ABCDE");

        ayo.getSurname().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getSurname(), "ABCDE");

        ayo.getDescription().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getDescription(), "ABCDE");

        ayo.clickMethod(ayo.getAreaCode());
        ayo.clickMethod(ayo.getTurkiyeAreaCode());

        ayo.getPhoneNumber().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getPhoneNumber(), "11");




    }

    @Then("düzenleme kaydet butonuna tıkla")
    public void düzenlemeKaydetButonunaTıkla() {
        ayo.clickMethod(ayo.getSaveAssignment());
    }
}
