package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NavbarPages;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;


public class P02_SearhBoxStepDefination {

    NavbarPages navbar;
    List<String> baslik;
    @Given("Kullanici search box a tiklar")
    public void kullanici_search_box_a_tiklar() {
        navbar=new NavbarPages();
        navbar.searchBoxIcon.click();
        ReusableMethods.waitFor(5);
    }
    @Given("Kullanici searc box a {string} girer")
    public void kullanici_searc_box_a_girer(String string) {
        navbar=new NavbarPages();
        navbar.searchBox.click();
        navbar.searchBox.sendKeys(string);
    }
    @Given("Kullanici enter a tiklar")
    public void kullanici_enter_a_tiklar() {
        navbar=new NavbarPages();
        navbar.searchBox.submit();
        ReusableMethods.waitFor(5);

        baslik = new ArrayList<>();
        for (WebElement element : navbar.baslikSonuclari) { // Tüm başlıkları WebElement listesinden alıyoruz
            baslik.add(element.getText()); // Metin olarak başlıkları listeye ekliyoruz
        }
        System.out.println("Tüm Başlıklar: " + baslik);
        ReusableMethods.waitFor(5);

    }
    @Given("Kullanici {int} inci habere tiklar")
    public void kullanici_inci_habere_tiklar(Integer index) {
        String selectedTitle = baslik.get(index - 1);
        System.out.println("Baslik Listesi Boyutu: " + baslik.size());
        ReusableMethods.waitFor(5);
        System.out.println(index + ". Haber Başlığı: " + selectedTitle);
        ReusableMethods.scrollElementWithJs(navbar.baslikSonuclari.get(index-1));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickElementByJS(navbar.baslikSonuclari.get(index - 1));
        System.out.println(Driver.getDriver().getTitle());

    }
    @Then("Kullanici {int}.haber bilgisini dogrular")
    public void kullanici_haber_bilgisini_dogrular(Integer index) {
        Assert.assertEquals(baslik.get(index - 1), navbar.textIletişim.getText());

    }
}



