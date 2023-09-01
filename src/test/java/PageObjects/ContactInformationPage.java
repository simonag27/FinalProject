package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement completeEmail;
    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement completePhoneNumber;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement completeCountry;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement completeCity;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement completePostCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationPageHeader;

    public ContactInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeEmailField(String string){
        completeEmail.sendKeys(string);
    }

    public void completePhoneNumberField(String string){
        completePhoneNumber.sendKeys(string);
    }

    public void completeCountryField(String string){
        completeCountry.sendKeys(string);
    }

    public void completeCityField(String string){
        completeCity.sendKeys(string);
    }

    public void completePostCodeField(String string){
        completePostCode.sendKeys(string);
    }


    public void completeAllFields(){
        completeEmailField("gridan_simona@yahoo.com");
        completePhoneNumberField("0760893428");
        completeCountryField("Romania");
        completeCityField("Sibiu");
        completePostCodeField("69345");
        clickOnNextButton();
    }

    public WebElement getClickOnNextButton() {
       return nextButton;
    }

    public void clickOnNextButton() {
        nextButton.click();
    }

    public String getContactInformationHeaderText(){
        return contactInformationPageHeader.getText();

    }




}
