package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AYOS_Atamalar_POM;

public class Atamalar_Filtreleme {

    AYOS_Atamalar_POM ayo =new AYOS_Atamalar_POM();
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
