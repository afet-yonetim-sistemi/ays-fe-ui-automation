package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class AYOS_Atamalar_POM extends MyMethods {

    public AYOS_Atamalar_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this); }

    @FindBy(xpath = "(//a[normalize-space()='Assignments'])[1]")
    private WebElement atamalar;

    @FindBy(xpath = "//span[@class='anticon anticon-down']//*[name()='svg']")
    private WebElement dilSecenegi;

    @FindBy(xpath = "(//span[normalize-space()='Türkçe'])[1]")
    private WebElement turkceDilSecenegi;
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

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement telefonNumarasi;

    @FindBy(xpath = "//div[@id='coordinates']//input[@id='latitude']")
    private WebElement enlem;

    @FindBy(xpath = "//div[@id='coordinates']//input[@id='longitude']")
    private WebElement boylam;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Kaydet')]")
    private WebElement atamayiKaydet;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/div[3]/button[1]")
    private WebElement atamayiSil;

    @FindBy(css = "button[class='ant-btn css-19achci ant-btn-default ant-btn-icon-only ant-tooltip-open']")
    private WebElement konumGoruntule;

  //  @FindBy(xpath = "//button[@class=\"ant-btn css-19achci ant-btn-default ant-btn-icon-only ant-btn-dangerous refine-delete-button\"]\n")
  //  private WebElement ;

    public WebElement getAtamalar() {
        return atamalar;
    }

    public WebElement getDilSecenegi() {
        return dilSecenegi;
    }

    public WebElement getTurkceDilSecenegi() {
        return turkceDilSecenegi;
    }
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

    public WebElement getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public WebElement getEnlem() {
        return enlem;
    }

    public WebElement getBoylam() {
        return boylam;
    }

    public WebElement getAtamayiKaydet() {
        return atamayiKaydet;
    }


}

