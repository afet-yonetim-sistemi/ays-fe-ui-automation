package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AYOS_Atamalar_POM;
import pages.Login_POM;
import utilities.DriverClass;

public class Atamalar_Olustur {

    AYOS_Atamalar_POM ayo =new AYOS_Atamalar_POM();
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
        ayo.clickMethod(ayo.getAtamalar());
    }

    @And("oluştur butonuna tıkla")
    public void oluşturButonunaTıkla() {
        ayo.clickMethod(ayo.getOlusturButonu());
    }

    @And("atama formunu doldur")
    public void atamaFormunuDoldur() {
        ayo.sendKeysMethod(ayo.getAdOlustur(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyadOlustur(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklamaOlustur(), "abcdfghh");
        ayo.clickMethod(ayo.getAlanKoduOlustur());
        ayo.clickMethod(ayo.getTurkiyeAlanKoduOlustur());
        ayo.sendKeysMethod(ayo.getTelefonNumarasiOlustur(), "");

    }

    @And("atama formunu doldururken ad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenAdKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getAdOlustur(), "?--/-**-8965");
        ayo.sendKeysMethod(ayo.getSoyadOlustur(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklamaOlustur(), "huıpvd");
        ayo.clickMethod(ayo.getAlanKoduOlustur());
        ayo.clickMethod(ayo.getTurkiyeAlanKoduOlustur());
        ayo.sendKeysMethod(ayo.getTelefonNumarasiOlustur(), "55555555");

    }

    @And("atama formunu doldururken soyad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenSoyadKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getAdOlustur(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyadOlustur(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklamaOlustur(), "abcuqopg");
        ayo.clickMethod(ayo.getAlanKoduOlustur());
        ayo.clickMethod(ayo.getTurkiyeAlanKoduOlustur());
        ayo.sendKeysMethod(ayo.getTelefonNumarasiOlustur(), "888888888");

    }

    @And("atama formunu doldururken geçersiz bir açıklama yaz")
    public void atamaFormunuDoldururkenGeçersizBirAçıklamaYaz() {
        ayo.sendKeysMethod(ayo.getAdOlustur(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyadOlustur(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklamaOlustur(), "?-/*-+?'!$[}");
        ayo.clickMethod(ayo.getAlanKoduOlustur());
        ayo.clickMethod(ayo.getTurkiyeAlanKoduOlustur());
        ayo.sendKeysMethod(ayo.getTelefonNumarasiOlustur(), "55555555");

    }

    @And("atama formunu doldururken geçersiz bir telefon numarası yaz")
    public void atamaFormunuDoldururkenGeçersizBirTelefonNumarasıYaz() {
        ayo.sendKeysMethod(ayo.getAd(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyad(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklama(), "acbdyagyqcbm");
        ayo.clickMethod(ayo.getAlanKodu());
        ayo.clickMethod(ayo.getTurkiyeAlanKodu());
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "161616");

    }

    @And("atama formunu doldururken geçersiz koordinatlar gir")
    public void atamaFormunuDoldururkenGeçersizKoordinatlarGir() {
        ayo.sendKeysMethod(ayo.getAd(), "rıfkı");
        ayo.sendKeysMethod(ayo.getSoyad(), "maraz");
        ayo.sendKeysMethod(ayo.getAciklama(), "qwertty");
        ayo.clickMethod(ayo.getAlanKodu());
        ayo.clickMethod(ayo.getTurkiyeAlanKodu());
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), " ");

    }

    @Then("kaydet butonuna tıkla")
    public void kaydetButonunaTıkla() {
        ayo.clickMethod(ayo.getAtamayiKaydet());
    }
}
