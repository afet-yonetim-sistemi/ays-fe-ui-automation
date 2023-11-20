package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AYOS_Assignments_POM;
import pages.Login_POM;
import utilities.DriverClass;

public class Assignments_Create {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    Login_POM gir =new Login_POM();
    @Given("sisteme giriş yap")
    public void sistemeGirişYap() {
        DriverClass.getDriver().get("https://test-kurum.afetyonetimsistemi.com/login");
        DriverClass.getDriver().manage().window().maximize();
        gir.sendKeysMethod(gir.getLoginUsername(), "ays-admin-1");
        gir.sendKeysMethod(gir.getLoginPassword(), "A123y456S.");
        gir.clickMethod(gir.getLoginButton());
      //  gir.waitUntilVisible(gir.getAdminsHeader());
      //  Assert.assertTrue(gir.getAdminsHeader().isDisplayed());
    }

    @When("atamalar sekmesine tıkla")
    public void atamalarSekmesineTıkla() {
    //    ayo.clickMethod(ayo.getDilSecenegi());
    //    ayo.clickMethod(ayo.getTurkceDilSecenegi());
        ayo.clickMethod(ayo.getAssignments());
    }

    @And("oluştur butonuna tıkla")
    public void oluşturButonunaTıkla() {
        ayo.clickMethod(ayo.getCreateButton());
    }

    @And("atama formunu doldur")
    public void atamaFormunuDoldur() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "abcdfghh");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "");

    }

    @And("atama formunu doldururken ad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenAdKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getCreateName(), "?--/-**-8965");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "huıpvd");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "55555555");

    }

    @And("atama formunu doldururken soyad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenSoyadKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "abcuqopg");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "888888888");

    }

    @And("atama formunu doldururken geçersiz bir açıklama yaz")
    public void atamaFormunuDoldururkenGeçersizBirAçıklamaYaz() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "?-/*-+?'!$[}");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "55555555");

    }

    @And("atama formunu doldururken geçersiz bir telefon numarası yaz")
    public void atamaFormunuDoldururkenGeçersizBirTelefonNumarasıYaz() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "acbdyagyqcbm");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "161616");

    }

    @And("atama formunu doldururken geçersiz koordinatlar gir")
    public void atamaFormunuDoldururkenGeçersizKoordinatlarGir() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "qwertty");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), " ");

    }

    @Then("kaydet butonuna tıkla")
    public void kaydetButonunaTıkla() {
        ayo.clickMethod(ayo.getSaveAssignment());
    }
}
