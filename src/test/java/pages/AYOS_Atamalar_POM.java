package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class AYOS_Atamalar_POM extends MyMethods {

    public AYOS_Atamalar_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this); }

    @FindBy(xpath = "//span[contains(text(),'Oluştur')]")
    private WebElement olusturButonu;
    @FindBy(xpath = "(//input[@id='firstName'])[1]")
    private WebElement ad;

    @FindBy(xpath = "(//input[@id='lastName'])[1]")
    private WebElement soyad;

    @FindBy(xpath = "(//input[@id='description'])[1]")
    private WebElement aciklama;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
    private WebElement alanKodu;

    @FindBy(xpath = "//button[@class=\"ant-btn css-19achci ant-btn-default ant-btn-icon-only ant-btn-dangerous refine-delete-button\"]\n")
    private WebElement ;

    public WebElement getOlusturButonu() {
        return olusturButonu;
    }
    public WebElement getAd() {
        return ad;
    }

    public WebElement getSoyad() {
        return soyad;
    }

    public WebElement getAciklama() {
        return aciklama;
    }

    public WebElement getAlanKodu() {
        return alanKodu;
    }

}

