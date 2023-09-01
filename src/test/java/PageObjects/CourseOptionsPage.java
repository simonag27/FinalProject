package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionsPage {
    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement clickOnButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickOnNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;

    public CourseOptionsPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void selectOneCourseOption(){
        clickOnButton.click();
    }

    public void accessNextButton(){
        clickOnNextButton.click();
    }

    public String getCourseOptionsHeaderText(){
        return courseOptionsHeader.getText();
    }
}
