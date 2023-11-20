package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

import java.util.List;

public class AYOS_Assignments_POM extends MyMethods {

    public AYOS_Assignments_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this); }

    @FindBy(xpath = "//a[text()='Assignments']/ancestor::li[@class='ant-menu-item']")
    private WebElement assignments;

    @FindBy(xpath = "//span[@class='anticon anticon-down']//*[name()='svg']")
    private WebElement languageOption;

    @FindBy(xpath = "(//span[normalize-space()='Türkçe'])[1]")
    private WebElement turkishLanguageOption;
    @FindBy(xpath = "//span[contains(text(),'Create')]")
    private WebElement createButton;

    //bunlar degistir icin
    @FindBy(xpath = "(//input[@id='firstName'])[2]")
    private WebElement name;

    @FindBy(xpath = "(//input[@id='lastName'])[2]")
    private WebElement surname;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    private WebElement description;

    @FindBy(xpath = "(//div[contains(@class, 'ant-select-show-arrow')])[3]") ////div[@class='ant-drawer-content-wrapper']//div[@role='dialog']//div[@class='ant-drawer-wrapper-body']//div[@class='ant-drawer-body']//div//input[@id='phoneNumber_countryCode']
    private WebElement areaCode;

    @FindBy(xpath = "//span[text()='90']")
    private WebElement turkiyeAreaCode;
    @FindBy(xpath = "//input[@id='phoneNumber_lineNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "(//span[contains(text(),'Select Location')])[2]")
    private WebElement location;

    @FindBy(xpath = "(//a[@title='Zoom in'])[1]")
    private WebElement locationZoomIn;
    @FindBy(xpath = "(//a[@title='Zoom out'])[1]")
    private WebElement locationZoomOut;
    @FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
    private WebElement saveAssignment;

    //atamalar olusturmak icin ayrica yeni locatorlar olustur

    @FindBy(xpath = "(//input[@id='firstName'])[1]")
    private WebElement createName;

    @FindBy(xpath = "(//input[@id='lastName'])[1]")
    private WebElement createSurname;

    @FindBy(xpath = "(//input[@id='description'])[1]")
    private WebElement createDescription;

    @FindBy(xpath = "(//div[contains(@class, 'ant-select-show-arrow')])[3]") ////div[@class='ant-drawer-content-wrapper']//div[@role='dialog']//div[@class='ant-drawer-wrapper-body']//div[@class='ant-drawer-body']//div//input[@id='phoneNumber_countryCode']
    private WebElement createAreaCode;

    @FindBy(xpath = "//span[text()='90']")
    private WebElement createTurkiyeAreaCode;
    @FindBy(xpath = "//input[@id='phoneNumber_lineNumber']")
    private WebElement createPhoneNumber;

    @FindBy(xpath = "(//span[contains(text(),'Select Location')])[1]")
    private WebElement createLocation;

    @FindBy(xpath = "(//a[@title='Zoom in'])[2]")
    private WebElement createLocationZoomIn;
    @FindBy(xpath = "(//a[@title='Zoom out'])[2]")
    private WebElement createLocationZoomOut;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[1]")
    private WebElement createSaveAssignment;

    @FindBy(xpath = "(//button[contains(@class,'refine-delete-button')])[1]")
    private WebElement deleteAssignment;

    @FindBy(xpath = "(//span[text()='Delete'])[2]")
    private WebElement sureDeleteAssignment;
    @FindBy(xpath = "//div[@class='ant-notification-notice-message']")
    private WebElement successMessageDelete;
    @FindBy(xpath = "(//button[@class='ant-btn css-zvd7y2 ant-btn-default ant-btn-icon-only'])[2]")
    private WebElement showLocation;

    @FindBy(xpath = "//div[@id='map-container']")
    private WebElement validateLocation;
    @FindBy(xpath = "//span[normalize-space()='Open With Google Maps']")
    private WebElement openGoogleMaps;

    @FindBy(xpath = "//span[normalize-space()='Copy The Location Details']")
    private WebElement copyLocationInfo;

    @FindBy(xpath = "//span[normalize-space()='Open On My Phone']")
    private WebElement openOnMyPhone;

    @FindBy(css = "button[class='ant-btn css-zvd7y2 ant-btn-default ant-btn-icon-only refine-edit-button']")
    private List<WebElement> edit;

    @FindBy(xpath = "(//button[contains(@class,'refine-show-button')])[1]")
    private WebElement show;

    @FindBy(xpath = "//h4[normalize-space()='Show Assignment']")
    private WebElement validateShow;

    @FindBy(xpath = "(//button[@class='ant-btn css-zvd7y2 ant-btn-default ant-btn-icon-only'])[1]")
    private WebElement filter;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    private WebElement filterBasedOnStatus;

    @FindBy(xpath = "//input[@id='phoneNumber_lineNumber']")
    private WebElement filterBasedOnPhoneNumber;

    @FindBy(xpath = "//input[@id='phoneNumber_countryCode']")
    private WebElement filterBasedOnAreaCode;

    @FindBy(xpath = "//span[normalize-space()='Filter']")
    private WebElement filterButton;

   @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Save')]")
   private WebElement editSaveButton;
    //body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/button[1]
  //  @FindBy(xpath = "//button[@class=\"ant-btn css-19achci ant-btn-default ant-btn-icon-only ant-btn-dangerous refine-delete-button\"]\n")
  //  private WebElement ;


    public WebElement getAssignments() {
        return assignments;
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

    public WebElement getTurkiyeAlanKodu() {
        return turkiyeAlanKodu;
    }

    public WebElement getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public WebElement getKonum() {
        return konum;
    }

    public WebElement getKonumYakinlastir() {
        return konumYakinlastir;
    }

    public WebElement getKonumUzaklastir() {
        return konumUzaklastir;
    }

    public WebElement getAtamayiKaydet() {
        return atamayiKaydet;
    }

    public WebElement getAdOlustur() {
        return adOlustur;
    }

    public WebElement getSoyadOlustur() {
        return soyadOlustur;
    }

    public WebElement getAciklamaOlustur() {
        return aciklamaOlustur;
    }

    public WebElement getAlanKoduOlustur() {
        return alanKoduOlustur;
    }

    public WebElement getTurkiyeAlanKoduOlustur() {
        return turkiyeAlanKoduOlustur;
    }

    public WebElement getTelefonNumarasiOlustur() {
        return telefonNumarasiOlustur;
    }

    public WebElement getKonumOlustur() {
        return konumOlustur;
    }

    public WebElement getKonumYakinlastirOlustur() {
        return konumYakinlastirOlustur;
    }

    public WebElement getKonumUzaklastirOlustur() {
        return konumUzaklastirOlustur;
    }

    public WebElement getAtamayiKaydetOlustur() {
        return atamayiKaydetOlustur;
    }

    public WebElement getAtamayiSil() {
        return atamayiSil;
    }

    public WebElement getAtamayiSilEminMisiniz() {
        return atamayiSilEminMisiniz;
    }

    public WebElement getSilBasariMesaji() {
        return silBasariMesaji;
    }

    public WebElement getKonumGoruntule() {
        return konumGoruntule;
    }

    public WebElement getKonumDogrula() {
        return konumDogrula;
    }

    public WebElement getGoogleHaritalardaAc() {
        return googleHaritalardaAc;
    }

    public WebElement getKonumuBilgileriniKopyala() {
        return konumuBilgileriniKopyala;
    }

    public WebElement getTelefonumdaAc() {
        return telefonumdaAc;
    }

    public List<WebElement> getDuzenle() {
        return duzenle;
    }

    public WebElement getGoster() {
        return goster;
    }

    public WebElement getGosterDogrulama() {
        return gosterDogrulama;
    }

    public WebElement getFiltrele() {
        return filtrele;
    }

    public WebElement getDurumaGoreFiltrele() {
        return durumaGoreFiltrele;
    }

    public WebElement getTelefonNumarasinaGoreFiltrele() {
        return telefonNumarasinaGoreFiltrele;
    }

    public WebElement getAlanKodunaGoreFiltrele() {
        return alanKodunaGoreFiltrele;
    }

    public WebElement getFiltrelemeButonu() {
        return filtrelemeButonu;
    }

    public WebElement getDuzenleKaydetButonu() {
        return duzenleKaydetButonu;
    }


}

