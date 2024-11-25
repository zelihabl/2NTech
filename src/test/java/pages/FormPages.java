package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormPages {
    public FormPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "name")
    public WebElement nameSurname;
    @FindBy(id = "birth")
    public WebElement birthDay;
    @FindBy(id = "tcKimlik")
    public WebElement tcKimlik;
    @FindBy(id = "phone")
    public WebElement phone;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id= "cv_field")
    public WebElement cvFile;
    @FindBy(xpath = "//button[@class='py-3 px-4 w-full rounded-md transition-all bg-[#F5F5F5] text-[#6E6E6E] hover:bg-[#DF1F29] hover:text-white'][2]")
    public WebElement eğitimButon;
    @FindBy(xpath = "//button[@class='w-8 h-8 flex justify-center items-center p-2 bg-[#DF1F29] rounded-full']")
    public WebElement forwardButton;
    @FindBy(xpath = "//div[@class='flex flex-col gap-2 group rounded-lg py-3 px-4 cursor-pointer transition-all bg-[#F5F5F5] hover:bg-[#DF1F29] hover:text-white'][2]")
    public WebElement testEngineerCard;
    @FindBy(xpath = "//div[@class='text-white flex justify-center items-center text-[14px] py-2 px-4 rounded-full bg-[#DF1F29] cursor-pointer']")
    public WebElement gönderButton;
    @FindBy(xpath = "//p[@class='text-[16px] flex justify-start items-start leading-6']") public WebElement mesaj;
}


