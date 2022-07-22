package com.example.Steps;

import com.example.Base.BaseClass;
import com.example.PageObjects.A_LoginPage;
import com.example.PageObjects.B_TrialsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class completeInterventionalTrial extends BaseClass {
    static WebDriver driver;

    @Before
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver","c:/Users/hildebrandrr/IdeaProjects/CTRP-2583/chromedriver 4.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    @Given("^Open Chrome and launch application$")
    public void open_chrome_and_launch_application() throws Throwable{
        System.setProperty("webdriver.chrome.driver","chromedriver 4");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver=new ChromeDriver();
        driver.get("https://trials-int.nci.nih.gov/");
        Thread.sleep(3000);
    }

    @When("^I enter Username and password")
    public void i_enterusername_and_password() throws Throwable{
        A_LoginPage loginPage=new A_LoginPage(driver);
        Thread.sleep(3000);
        loginPage.setUserName();
        loginPage.setPassword();
    }

    @When("^the website opens$")
    public void the_website_opens() throws Throwable{
        A_LoginPage loginPage=new A_LoginPage(driver);
        loginPage.clickSigninSubmit();
        Thread.sleep(4000);
    }

    @When("^I click on Protocol Abstraction$")
    public void i_click_on_protocol_abstraction() throws Throwable
    {
        A_LoginPage loginPage=new A_LoginPage(driver);
        loginPage.clickProtocolAbstraction();
        loginPage.clickAccept();
        Thread.sleep(4500);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //webdriver.quit();
//        objTrialsPage=new B_TrialsPage(driver);
//        objTrialsPage.clickTrialsMenuOption();
    }


    @Given("I click on trials menu option")
    public void iClickOnTrialsMenuOption() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickTrialsMenuOption();
    }

    @When("I select identifier type NCI")
    public void iSelectIdentifierTypeNCI() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.selectIdentifierType();
    }

    @Then("I type into identifier")
    public void iTypeIntoIdentifier() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.typeIntoIdentifier();
    }

    @Then("I click on search")
    public void iClickOnSearch() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickSearch();
    }

    @Then("I click on NCI identifier")
    public void iClickOnNCIIdentifier() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickNCIIdentifier();
    }

    @Then("I click on trial validation")
    public void iClickOnTrialValidation() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickOnTrialValidation();
    }

    @Then("I click on accept")
    public void iClickOnAccept() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickOnAccept();
    }

    @Then("I click on trial description")
    public void iClickOnTrialDescription() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickTrialDescription();
    }

    @Then("I type complete interventional trial lorem ipsum into text area")
    public void iTypeCompleteInterventionalTrialLoremIpsumIntoTextArea() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.typeCompleteInterventionalTrial();
    }

    @Then("I click on briefTitle")
    public void iClickOnBriefTitle() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickOnBriefTitle();
    }

    @Then("I type complete interventional trial into briefTitle")
    public void iTypeCompleteInterventionalTrialIntoBriefTitle() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.typeIntoBriefTitle();
    }

    @Then("I click save")
    public void iClickSave() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickSave();
    }

    @Then("I click on Abstraction Validation and Design Details")
    public void iClickOnAbstractionValidationAndDesignDetails() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.clickAbstractionValidationAndDesignDetails();
    }

    @Then("I create single group no masking randomized controlled trial")
    public void iCreateSingleGroupNoMaskingRandomizedControlledTrial() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.createSingleGroupNoMaskingRandomizedControlledTrial();
    }

    @Then("I create outcome measures")
    public void iCreateOutcomeMeasures() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.createOutcomeMeasures();
    }

    @Then("I enter healthy, gender, and age criteria")
    public void iEnterHealthyGenderAndAgeCriteria() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterHealthyGenderAgeCriteria();
    }

    @Then("I enter inclusion criteria")
    public void iEnterInclusionCriteria() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterInclusionCriteria();
    }

    @Then("I enter disease condition")
    public void iEnterDiseaseCondition() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterDiseaseCondition();
    }

    @Then("I enter NCI Specific Information")
    public void iEnterNCISpecificInformation() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterNCISpecificInfo();
    }

    @Then("I enter human subject safety")
    public void iEnterHumanSubjectSafety() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.humanSubjectSafety();
    }

    @Then("I enter milestones")
    public void iEnterMilestones() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.enterMilestones();
    }

    @Then("I enter info on participating sites")
    public void iEnterInfoOnParticipatingSites() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.participatingSites();
    }

    @Then("I enter info on accrual access")
    public void iEnterInfoOnAccrualAccess() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.accrualAccess();
    }

    @Then("I assert current trial status is active")
    public void iAssertCurrentTrialStatusIsActive() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.assertActiveTrialStatus();
    }

    @Then("I assert processing status matches abstraction verified no response")
    public void iAssertProcessingStatusMatchesAbstractionVerifiedNoResponse() {
        B_TrialsPage trialsPage=new B_TrialsPage(driver);
        trialsPage.assertProcessingStatus();
    }
}
