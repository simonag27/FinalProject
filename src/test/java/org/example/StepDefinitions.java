package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class StepDefinitions {

    private final WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;

    RegisterPage registerPage;

    ContactInformationPage contactInformationPage;
    CourseOptionsPage courseOptionsPage;

    HybridPage hybridPage;

    PaymentInfoPage paymentInfoPage;

    FundamentalsPage fundamentalsPage;

    InPersonPage inPersonPage;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        contactInformationPage = new ContactInformationPage(driver);
        courseOptionsPage = new CourseOptionsPage(driver);
        hybridPage = new HybridPage(driver);
        paymentInfoPage = new PaymentInfoPage(driver);
        fundamentalsPage = new FundamentalsPage(driver);
        inPersonPage = new InPersonPage(driver);

    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/Simona/Downloads/Testing-Env-master%20(1)/Testing-Env-master/index.html");
    }

    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
        driver.get("file:///C:/Users/Simona/Downloads/Testing-Env-master%20(1)/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the contact information page")
    public void iAmOnTheContactInformationPage() {
        driver.get("file:///C:/Users/Simona/Downloads/Testing-Env-master%20(1)/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInAllFields();
        Utils.scrollToElement(driver, registerPage.getClickOnNextButton()); // da scroll pana in josul paginii, la butonul de next
        registerPage.accessNextButton();
    }

    @Given("I am on the course options page")
    public void iAmOnTheCourseOptionsPage() {
        driver.get("file:///C:/Users/Simona/Downloads/Testing-Env-master%20(1)/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInAllFields();
        Utils.scrollToElement(driver, registerPage.getClickOnNextButton()); // da scroll pana in josul paginii, la butonul de next
        registerPage.accessNextButton();

        contactInformationPage.completeAllFields();
    }

    @When("The email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPage.inputValueInEmailField(string);
    }

    @When("The submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @When("I click on Start The Enrollment button")
    public void click_on_start_the_enrollment_button() {
        mainPage.clickOnStartTheEnrollmentButton();
    }

    @When("The first name value of {string} is inputted")
    public void input_first_name(String string) {
        registerPage.completeFirstNameField(string);
    }

    @When("The Virtual Read More button is clicked")
    public void click_virtual_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnSubmitButton();
    }

    @When("I click on Read More button from Hybrid section")
    public void click_hybrid_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnHybridReadMoreButton();
    }

    @When("The last name of {string} is inputted")
    public void input_last_name(String string) {
        registerPage.completeLastNameField(string);
    }

    @When("The username of {string} is inputted")
    public void input_username(String string) {
        registerPage.completeUsernameField(string);
    }

    @When("The password of {string} is inputted")
    public void input_password(String string) {
        registerPage.completePasswordField(string);
    }

    @When("The {string} password confirmation is inputted")
    public void confirm_password(String string) {
        registerPage.completePasswordConfirmationField(string);
    }

    @When("The Next button is clicked")
    public void click_on_next_button() {
        Utils.scrollToElement(driver, registerPage.getClickOnNextButton());
        registerPage.accessNextButton();
    }

    @When("The {string} email from Contact Information page is completed")
    public void complete_email(String string) {
        contactInformationPage.completeEmailField(string);
    }

    @When("The {string} phone number from Contact Information page is completed")
    public void complete_phone_number(String string) {
        contactInformationPage.completePhoneNumberField(string);
    }

    @When("The {string} country from Contact Information page is completed")
    public void complete_country(String string) {
        contactInformationPage.completeCountryField(string);
    }

    @When("The {string} city form Contact Information page is completed")
    public void complete_city(String string) {
        contactInformationPage.completeCityField(string);
    }

    @When("The {string} post code from Contact Information page is completed")
    public void complete_post_code(String string) {
        contactInformationPage.completePostCodeField(string);
    }

    @When("The next button from Contact Information page is clicked")
    public void click_next_button() {
        contactInformationPage.clickOnNextButton();
    }

    @When("I select one course option")
    public void select_one_course_option() {
        courseOptionsPage.selectOneCourseOption();
    }

    @When("I click on Next button from Course Options page")
    public void click_on_next_button_from_course_options() {
        courseOptionsPage.accessNextButton();
    }

    @When("I click on the Read More button from Learn the Fundamentals section")
    public void click_Read_More_Fundamentals_Button() {
        Utils.scrollToElement(driver, mainPage.getLearnFundamentalsHeader());
        mainPage.clickOnReadMoreFundamentalsButton();
    }

    @When("I click on the Read More button from Learn Selenium section")
    public void click_Read_More_Selenium_Button() {
        Utils.scrollToElement(driver, mainPage.getLearnSeleniumHeader());
        mainPage.clickOnReadMoreSelenium();
    }

    @When("I click on the Questions button")
    public void click_on_questions_button() {
        mainPage.clickOnQuestionsButton();
    }

    @When("I click on Instructors button")
    public void click_on_instructors_button() {
        mainPage.clickOnInstructorsButton();
    }

    @When("I click on the Read More from In Person button")
    public void click_on_the_in_person_button() {
        Utils.scrollToElement(driver, mainPage.getInPersonHeader());
        mainPage.clickOnInPersonButton();
    }


    @Then("The Personal Information page opens")
    public void thePersonalInformationPageOpens() {
        Assertions.assertEquals("Personal information",
                registerPage.getPersonalInformationHeaderText());
    }

    @Then("The newsletter pop-up appears")
    public void theNewsletterPopUpAppears() {
        driver.switchTo().alert().accept(); //cu switch isi indreapta atentia catre pop-up
    }

    @Then("A pop-up tab will confirm the email")
    public void aPopUpTabWillConfirmTheEmail() {
        driver.switchTo().alert().accept();
    }


    @Then("The Contact Information page opens")
    public void theContactInformationPageOpens() {
        Assertions.assertEquals("Contact information",
                contactInformationPage.getContactInformationHeaderText());
    }

    @Then("The Course Option page opens")
    public void theCourseOptionPageOpens() {
        Assertions.assertEquals("Course options",
                courseOptionsPage.getCourseOptionsHeaderText());
    }

    @Then("The Hybrid page opens")
    public void theHybridPageOpens(){
        Assertions.assertEquals("Hybrid",
                hybridPage.getHybridHeaderText());
    }

    @Then("I remain on the main page")
    public void iRemainOnTheMainPage() {
        Assertions.assertEquals("Software testing course",
                mainPage.getMainPageHeaderText());

    }

    @Then("The Payment Information page opens")
    public void thePaymentInformationPageOpens() {
        Assertions.assertEquals("Payment information",
                paymentInfoPage.getPaymentInfoHeaderText());
    }

    @Then("I remain on Course Options page")
    public void iRemainOnCourseOptionsPage() {
        Assertions.assertEquals("Course Options",
                courseOptionsPage.getCourseOptionsHeaderText());
    }

    @Then("I remain on Personal Information page")
    public void iRemainOnPersonalInformationPage() {
        Assertions.assertEquals("Personal Information",
                registerPage.getPersonalInformationHeaderText());
    }

    @Then("I remain on Contact Information page")
    public void iRemainOnContactInformationPage() {
        Assertions.assertEquals("Contact Information",
                contactInformationPage.getContactInformationHeaderText());
    }


    @Then("The Fundamentals page opens")
    public void theFundamentalsPageOpens() {
        Assertions.assertEquals("Fundamentals page",
                fundamentalsPage.getFundamentalsPageText());
    }

    @Then("the {string} page opens")
    public void thePageOpens(String arg0) {
        Assertions.assertEquals(arg0, driver.getTitle());
    }


    @Then("the email bar turns red")
    public void theEmailBarTurnsRed() {
        Assertions.assertTrue( driver.getPageSource().contains("error"));
    }


    @Then("The Selenium page opens")
    public void theSeleniumPageOpens() {
        Assertions.assertEquals("Selenium page",
                fundamentalsPage.getFundamentalsPageText());
    }

    @Then("The Frequently Asked Questions appears")
    public void theFrequentlyAskedQuestionsAppears() {
        Assertions.assertEquals("Frequently Asked Questions",
                mainPage.getFrequentlyAskedQuestionsHeader());

    }


    @Then("Our Instructors section from main page appears")
    public void ourInstructorsSectionFromMainPageAppears() {
        Assertions.assertEquals("Our Instructors",
                mainPage.getInstructorsHeader());

    }

    @Then("In Person page opens")
    public void inPersonPageOpens() {
        Assertions.assertEquals("In Person", inPersonPage.getInPersonHeader());
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }
}







