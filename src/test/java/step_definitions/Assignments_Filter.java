package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AYOS_Assignments_POM;

public class Assignments_Filter {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("filtre simgesine tıkla")
    public void filtreSimgesineTıkla() {
       ayo.clickMethod(ayo.getFilter());
    }

    @And("durum menüsünden available seçeneğini seç")
    public void durumMenüsündenAvailableSeçeneğiniSeç() {
        ayo.clickMethod(ayo.getFilterBasedOnStatus());

    }

    @And("telefon numarasına göre filtrele.")
    public void telefonNumarasınaGöreFiltrele() {
        ayo.clickMethod(ayo.getFilterBasedOnPhoneNumber());

    }

    @Then("filtreleme butonuna tıkla")
    public void filtrelemeButonunaTıkla() {
       ayo.clickMethod(ayo.getFilterButton());
    }

}
