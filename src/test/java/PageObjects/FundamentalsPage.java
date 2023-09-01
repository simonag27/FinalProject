package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundamentalsPage {
    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalsPageHeader;

    public FundamentalsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getFundamentalsPageText(){
        return fundamentalsPageHeader.getText();
    }
}
