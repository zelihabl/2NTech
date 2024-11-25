package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NavbarPages {
    public NavbarPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='cmsmasters-animation']")
    public WebElement navbarNeden;
    @FindBy(xpath = "//div[@class='elementor-widget-cmsmasters-search__popup-trigger-container']")
    public WebElement searchBoxIcon;
    @FindBy(xpath = "//*[@class='elementor-widget-cmsmasters-search__field ']")
    public WebElement searchBox;
    @FindBy(xpath = "//a[@class='cmsmasters-animation']")
    public List<WebElement> baslikSonuclari;
    @FindBy(xpath = "//h1[text()='İletişim']") public WebElement textIletişim;
    @FindBy(css = "nav ul li a")
    public List<WebElement> navbarElement;







}
