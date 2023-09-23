package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
        DriverClass.getDriver().get("https://main.d2aa4zjw6bvfk3.amplifyapp.com/login");
        DriverClass.getDriver().manage().window().maximize();
        gir.sendKeysMethod(gir.getLoginUsername(), "ays-admin-1");
        gir.sendKeysMethod(gir.getLoginPassword(), "A123y456S.");
        gir.clickMethod(gir.getLoginButton());
        gir.waitUntilVisible(gir.getAdminsHeader());
        Assert.assertTrue(gir.getAdminsHeader().isDisplayed());
    }

    @When("atamalar sekmesine tıkla")
    public void atamalarSekmesineTıkla() {
        ayo.clickMethod(ayo.getDilSecenegi());
        ayo.clickMethod(ayo.getTurkceDilSecenegi());
        ayo.clickMethod(ayo.getAtamalar());
    }

    @And("oluştur butonuna tıkla")
    public void oluşturButonunaTıkla() {
        ayo.clickMethod(ayo.getOlusturButonu());
    }

    @And("atama formunu doldur")
    public void atamaFormunuDoldur() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }

    @And("atama formunu doldururken ad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenAdKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }

    @And("atama formunu doldururken soyad kısmında geçersiz karakterler kullan")
    public void atamaFormunuDoldururkenSoyadKısmındaGeçersizKarakterlerKullan() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }

    @And("atama formunu doldururken geçersiz bir açıklama yaz")
    public void atamaFormunuDoldururkenGeçersizBirAçıklamaYaz() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }

    @And("atama formunu doldururken geçersiz bir telefon numarası yaz")
    public void atamaFormunuDoldururkenGeçersizBirTelefonNumarasıYaz() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }

    @And("atama formunu doldururken geçersiz koordinatlar gir")
    public void atamaFormunuDoldururkenGeçersizKoordinatlarGir() {
        ayo.sendKeysMethod(ayo.getAd(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getSoyad(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getAciklama(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getAlanKodu(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getTelefonNumarasi(), "ays-admin-1");
        ayo.sendKeysMethod(ayo.getEnlem(), "A123y456S.");
        ayo.sendKeysMethod(ayo.getBoylam(), "ays-admin-1");
    }
}
