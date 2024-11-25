package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NavbarPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class P01_NavbarStepDefinition {
    NavbarPages navbar;

    @Given("Kullanici navbarda bulunan elementlere tiklar")
    public void kullanici_navbarda_bulunan_elementlere_tiklar() {
        navbar = new NavbarPages();

        for (WebElement element : navbar.navbarElement) {
            System.out.println(element.getText());
            try {
                // Eğer navbar elemanı tıklanabilirse
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();  // Elemanı tıkla
                    // Sayfanın düzgün şekilde açıldığı kontrol edilir
                    Assert.assertTrue("Sayfa başlığı kontrol edilemedi",
                            Driver.getDriver().getTitle().length() > 0);
                    System.out.println("Başlık: " + Driver.getDriver().getTitle());

                    // Sayfaya tıkladıktan sonra geri gidilir ve bir sonraki elemanla devam eder
                    Driver.getDriver().navigate().back();
                    ReusableMethods.waitFor(3);
                }
            } catch (Exception e) {
                // Hataları yakala ve mesajla göster
                System.out.println("Bir hata oluştu: " + e.getMessage());
            }
        }

    }
}




