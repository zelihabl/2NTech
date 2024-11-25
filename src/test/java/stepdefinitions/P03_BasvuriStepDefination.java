package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FormPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class P03_BasvuriStepDefination {
    Faker faker = new Faker();
    FormPages form = new FormPages();

    @Given("Kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("Kullanici AdSoyad inputuna {string} girer")
    public void kullanici_ad_soyad_inputuna_girer(String string) {
        form = new FormPages();
        form.nameSurname.sendKeys(faker.name().username());
        ReusableMethods.waitFor(3);
    }
    @When("Kullanici Dogum Tarihi inptuna {string} girer")
    public void kullanici_dogum_tarihi_inptuna_girer(String string) {
        form = new FormPages();
        form.birthDay.sendKeys(string);
        ReusableMethods.waitFor(3);
    }
    @When("Kullanici Tc kimlik numarasi inputuna {string} girer")
    public void kullanici_tc_kimlik_numarasi_inputuna_girer(String string) {
        form = new FormPages();
        form.tcKimlik.sendKeys(faker.regexify("[0-9]{11}"));
        ReusableMethods.waitFor(3);
    }

    @When("Kullanici Cep telefonu inputuna {string} girer")
    public void kullanici_cep_telefonu_inputuna_girer(String string) {
        form = new FormPages();
        form.phone.sendKeys(faker.regexify("0599" + "[1-9]{2}[1-9]{3}[1-9]{2}"));
        ReusableMethods.waitFor(3);
        System.out.println(string);
    }
    @When("Kullanici Mail adresi inputuna {string} girer")
    public void kullanici_mail_adresi_inputuna_girer(String string) {
        form = new FormPages();
        form.email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollElementWithJs(form.email);
    }

    @When("Kullanici cv inputuna dosya yükler")
    public void kullanici_cv_inputuna_dosya_yükler() {
        form = new FormPages();

        String filePath = "C:\\Users\\zelih\\OneDrive\\Masaüstü\\ZELIHA BALI-RESUME.pdf";
        System.out.println("Dosya Yolu: " + filePath);
        ReusableMethods.waitFor(3);
        form.cvFile.sendKeys(filePath);
        ReusableMethods.waitFor(3);
    }
    @When("Kullanici eğitim bilgisi seçer")
    public void kullanici_eğitim_bilgisi_seçer() {
        form = new FormPages();
        ReusableMethods.clickElementByJS(form.eğitimButon);
        ReusableMethods.waitFor(3);
        //navbar.eğitimButon.click();
    }
    @When("Kullanici forward buttona tiklar")
    public void kullanici_forward_buttona_tiklar() {
        form = new FormPages();
        ReusableMethods.clickElementByJS(form.forwardButton);
        ReusableMethods.waitFor(3);
        //navbar.forwardButton.click();
        ReusableMethods.scrollElementWithJs(form.testEngineerCard);
    }

    @When("Kullanici Test Engineer kartini secer")
    public void kullanici_test_engineer_kartini_secer() {
        form = new FormPages();
        form.testEngineerCard.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollElementWithJs(form.testEngineerCard);
    }

    @When("Kullanıci gönder butonuna tiklar")
    public void kullanıci_gönder_butonuna_tiklar() {
        form = new FormPages();
        form.gönderButton.click();
        ReusableMethods.waitFor(5);
    }

    @Then("Kullanici basarili mesajini dogrular")
    public void kullanici_basarili_mesajini_dogrular() {

        Assert.assertTrue(ReusableMethods.waitForVisibility(form.mesaj, 5).isDisplayed());
        ReusableMethods.waitFor(3);
    }
}