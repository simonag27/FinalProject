package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement readMoreVirtual;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement accessHybridPage;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement accessReadMoreFundamentals;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement softwareTestingCourse;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnFundamentalsHeader;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement accessReadMoreSelenium;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSeleniumHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement accessQuestionsButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement frequentlyAskedQuestionsHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement accessInstructorsButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsSection;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement accessInPersonButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inPersonSection;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this); }

    public void inputValueInEmailField(String string){
        inputEmailField.sendKeys(string);
    }

    public void clickOnSubmitButton(){
        elementSubmitButton.click();
    }

    public void clickOnStartTheEnrollmentButton() {
        startTheEnrollmentButton.click();
    }

    public void clickOnHybridReadMoreButton(){
        accessHybridPage.click();
    }

    public void clickOnReadMoreFundamentalsButton() {
        accessReadMoreFundamentals.click();
    }

    public WebElement getVirtualHeader() {
        return virtualHeader;
    }

     public void clickOnVirtualReadMore() {
        readMoreVirtual.click();
    }

    public String getMainPageHeaderText(){
        return softwareTestingCourse.getText();
    }

    public WebElement getLearnFundamentalsHeader() {
        return learnFundamentalsHeader;
    }

    public WebElement getLearnSeleniumHeader(){
        return learnSeleniumHeader;
    }

    public void clickOnReadMoreSelenium(){
        accessReadMoreSelenium.click();
    }

    public void clickOnQuestionsButton (){
        accessQuestionsButton.click();
    }

    public String getFrequentlyAskedQuestionsHeader(){
        return frequentlyAskedQuestionsHeader.getText();
    }

    public void clickOnInstructorsButton(){
        accessInstructorsButton.click();
    }

    public String getInstructorsHeader(){
        return instructorsSection.getText();
    }

    public void clickOnInPersonButton(){
        accessInPersonButton.click();
    }

    public WebElement getInPersonHeader(){
        return inPersonSection;
    }


}
