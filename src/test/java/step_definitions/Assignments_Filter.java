package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AYOS_Assignments_POM;

public class Assignments_Filter {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("filtre simgesine tıkla")
    public void filtreSimgesineTıkla() {
       ayo.clickMethod(ayo.getFiltrele());
    }

    @And("durum menüsünden available seçeneğini seç")
    public void durumMenüsündenAvailableSeçeneğiniSeç() {
        ayo.clickMethod(ayo.getDurumaGoreFiltrele());

    }

    @And("telefon numarasına göre filtrele.")
    public void telefonNumarasınaGöreFiltrele() {
        ayo.clickMethod(ayo.getTelefonNumarasinaGoreFiltrele());

    }

    @Then("filtreleme butonuna tıkla")
    public void filtrelemeButonunaTıkla() {
       ayo.clickMethod(ayo.getFiltrelemeButonu());
    }

}