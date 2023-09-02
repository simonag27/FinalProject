package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement introduceFirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement introduceLastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement introduceUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement introducePassword;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickOnNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationPageHeader;


    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeFirstNameField (String string){
        introduceFirstName.sendKeys(string);
    }

    public void completeLastNameField (String string){
        introduceLastName.sendKeys(string);
    }

    public void completeUsernameField (String string){
        introduceUsername.sendKeys(string);
    }

    public void completePasswordField (String string){
        introducePassword.sendKeys(string);
    }

    public void completePasswordConfirmationField (String string) {
        confirmPassword.sendKeys(string);
    }

    public void accessNextButton(){
        clickOnNextButton.click();
    }

    public WebElement getClickOnNextButton() {
        return clickOnNextButton;
    }

    public void fillInAllFields(){
        completeFirstNameField("AAA");
        completeLastNameField("BBB");
        completeUsernameField("CCC");
        completePasswordField("DDD");
        completePasswordConfirmationField("DDD");
    }

    public String getPersonalInformationHeaderText(){
        return personalInformationPageHeader.getText();
    }



}
