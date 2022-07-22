package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class B_TrialsPage extends BaseClass {

    public static WebDriver weBdriver;

    public B_TrialsPage(WebDriver ldriver) {
        this.weBdriver = ldriver;
        PageFactory.initElements(ldriver, this);
    }

    public void clickTrialsMenuOption() {//step 3
        weBdriver.findElement(By.id("trialSearchMenuOption")).click();
    }

    public void selectIdentifierType() {//step 4
        weBdriver.findElement(By.id("identifierType")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("identifierType"));
            dropdown.findElement(By.xpath("//option[. = 'NCI']")).click();
        }
    }

    public void typeIntoIdentifier() {//step 5
        weBdriver.findElement(By.id("identifier")).click();
        weBdriver.findElement(By.id("identifier")).sendKeys("NCI-2021-00010");
    }

    public void clickSearch() {//step 7
        weBdriver.findElement(By.cssSelector(".search")).click();
    }

    public void clickNCIIdentifier() {//Step 8
        weBdriver.findElement(By.linkText("NCI-2021-00010")).click();
    }

    public void clickOnTrialValidation() {//Step 9
        weBdriver.findElement(By.linkText("Trial Validation")).click();
    }

    public void clickOnAccept() {//Step 10
        weBdriver.findElement(By.cssSelector(".confirm")).click();
    }

    public void clickTrialDescription() {//Step 11-12
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
        weBdriver.findElement(By.linkText("Trial Description")).click();
    }

    public void typeCompleteInterventionalTrial() {//Step 13
        weBdriver.findElement(By.id("trialBriefTitle")).sendKeys("This is a complete interventional trial -9 no sea takimata sanctus est Lorem ipsum dolor sit amet");
    }

    public void clickOnBriefTitle(){// Step 14a
        weBdriver.findElement(By.id("trialBriefSummary")).click();
    }
    public void typeIntoBriefTitle(){// Step 14b
        weBdriver.findElement(By.id("trialBriefSummary")).sendKeys("This is a complete interventional trial -Unique Title -- Lorem ipsum dolor sit amet, consetetur");
    }
    public void clickSave(){//Step 15
        weBdriver.findElement(By.cssSelector(".save")).click();
    }
    public void clickAbstractionValidationAndDesignDetails(){//Step 16-17
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();

        weBdriver.findElement(By.linkText("Design Details")).click();
    }
    public void createSingleGroupNoMaskingRandomizedControlledTrial(){//Steps 18-23
        weBdriver.findElement(By.id("conf")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("conf"));
            dropdown.findElement(By.xpath("//option[. = 'Single Group']")).click();
        }
        weBdriver.findElement(By.id("interventionGroup")).click();
        weBdriver.findElement(By.id("interventionGroup")).sendKeys("1");
        weBdriver.findElement(By.id("noMasking")).click();
        weBdriver.findElement(By.id("allocation")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("allocation"));
            dropdown.findElement(By.xpath("//option[. = 'Randomized Controlled Trial']")).click();
        }
        weBdriver.findElement(By.id("enrollment")).click();
        weBdriver.findElement(By.id("enrollment")).sendKeys("10");
        weBdriver.findElement(By.cssSelector(".save")).click();
    }
    public void createOutcomeMeasures(){//Steps 24-30
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
        weBdriver.findElement(By.linkText("Outcome Measures")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("webDTO.outcomeMeasure.typeCode")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("webDTO.outcomeMeasure.typeCode"));
            dropdown.findElement(By.xpath("//option[. = 'Primary']")).click();
        }
        weBdriver.findElement(By.cssSelector("tr:nth-child(2)")).click();
        weBdriver.findElement(By.id("fileName")).sendKeys("This is an outcome measure for complete interventional");
        weBdriver.findElement(By.cssSelector("tr:nth-child(3)")).click();
        weBdriver.findElement(By.id("typeCode")).sendKeys("This trial continues for a period of 10 months and may continue later");
        weBdriver.findElement(By.cssSelector(".save")).click();
    }
    public void enterHealthyGenderAgeCriteria(){//Steps31-39
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
        weBdriver.findElement(By.linkText("Eligibility Criteria")).click();
        weBdriver.findElement(By.id("acceptHealthy")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("acceptHealthy"));
            dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
        }
        weBdriver.findElement(By.id("gender")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("gender"));
            dropdown.findElement(By.xpath("//option[. = 'All']")).click();
        }
        weBdriver.findElement(By.id("minage")).click();
        weBdriver.findElement(By.id("minage")).sendKeys("18");
        weBdriver.findElement(By.id("minageunit")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("minageunit"));
            dropdown.findElement(By.xpath("//option[. = 'Years']")).click();
        }
        weBdriver.findElement(By.id("maxage")).click();
        weBdriver.findElement(By.id("maxage")).sendKeys("40");
        weBdriver.findElement(By.id("maxageunit")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("maxageunit"));
            dropdown.findElement(By.xpath("//option[. = 'Years']")).click();
        }
        weBdriver.findElement(By.cssSelector(".save")).click();
        weBdriver.findElement(By.cssSelector("li:nth-child(2) .add")).click();
    }
    public void enterInclusionCriteria(){//Steps 40-43
        weBdriver.findElement(By.id("webDTO.inclusionIndicator")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("webDTO.inclusionIndicator"));
            dropdown.findElement(By.xpath("//option[. = 'Inclusion']")).click();
        }
        weBdriver.findElement(By.id("webDTO.textDescription")).click();
        weBdriver.findElement(By.id("webDTO.textDescription")).sendKeys("The participant should be a healthy individual");

        weBdriver.findElement(By.cssSelector(".save")).click();
    }
    public void enterDiseaseCondition(){//Steps 44-62
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
        weBdriver.findElement(By.linkText("Disease/Condition")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("disease")).click();
        weBdriver.findElement(By.id("disease")).sendKeys("breast cancer");
        weBdriver.findElement(By.id("disease")).sendKeys(Keys.ENTER);
        weBdriver.findElement(By.cssSelector(".breadcrumbItemPane:nth-child(2) .breadcrumbHighlight")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
        weBdriver.findElement(By.linkText("Interventions")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("interventionType")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("interventionType"));
            dropdown.findElement(By.xpath("//option[. = 'Drug']")).click();
        }
        weBdriver.findElement(By.id("name")).click();
        weBdriver.findElement(By.cssSelector(".search")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("searchName")).click();
        weBdriver.findElement(By.id("searchName")).sendKeys("breast");
        weBdriver.findElement(By.cssSelector(".search")).click();//step 60
        //vars.put("window_handles", weBdriver.getWindowHandles());
        weBdriver.findElement(By.linkText("C116435")).click();
        //vars.put("win67", waitForWindow(2000));
        //vars.put("root", weBdriver.getWindowHandle());
        //weBdriver.switchTo().window(vars.get("win67").toString());
        //weBdriver.close();
        //weBdriver.switchTo().window(vars.get("root").toString());
        weBdriver.switchTo().frame(2);
        {
            WebElement element = weBdriver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(weBdriver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = weBdriver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(weBdriver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = weBdriver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(weBdriver);
            builder.moveToElement(element).release().perform();
        }
        weBdriver.findElement(By.cssSelector(".odd:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.cssSelector(".save")).click();//62
    }
    public void enterNCISpecificInfo(){//Steps 63-66
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();//63
        weBdriver.findElement(By.linkText("NCI Specific Information")).click();//64
        weBdriver.findElement(By.cssSelector(".save")).click();//65
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();//66
    }
    public void humanSubjectSafety(){//Step 67
        weBdriver.findElement(By.linkText("Human Subject Safety")).click();
        weBdriver.findElement(By.id("boardApprovalStatusCode")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("boardApprovalStatusCode"));
            dropdown.findElement(By.xpath("//option[. = 'Submitted, approved']")).click();
        }
        weBdriver.findElement(By.cssSelector(".search")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("orgPoIdSearch")).click();
        weBdriver.findElement(By.id("orgPoIdSearch")).sendKeys("7434");
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .search")).click();
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.id("boardApprovalNumber")).click();
        weBdriver.findElement(By.id("boardApprovalNumber")).sendKeys("5353533533");
        weBdriver.findElement(By.id("boardName")).click();
        weBdriver.findElement(By.id("boardName")).sendKeys("Human Subject Safety Information details");
        weBdriver.findElement(By.cssSelector(".save")).click();
        weBdriver.findElement(By.linkText("Abstraction Validation")).click();
    }
    public void enterMilestones(){//Steps 68-93
        weBdriver.findElement(By.linkText("Trial Milestones")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Administrative Processing Start Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Administrative Processing Completed Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Ready for Administrative QC Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Administrative QC Start Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Administrative QC Completed Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Scientific Processing Start Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Scientific Processing Completed Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Ready for Scientific QC Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Scientific QC Start Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Scientific QC Completed Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'Initial Abstraction Verified Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("milestone")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("milestone"));
            dropdown.findElement(By.xpath("//option[. = 'On-going Abstraction Verified Date']")).click();
        }
        weBdriver.findElement(By.cssSelector(".add")).click();
    }
    public void participatingSites(){//Step 94
        // Participating sites
        weBdriver.findElement(By.linkText("Participating Sites")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.cssSelector(".form:nth-child(2) > tbody > tr > .value .search")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("orgPoIdSearch")).click();
        weBdriver.findElement(By.id("orgPoIdSearch")).sendKeys("7434");
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .search")).click();
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) .add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.id("recStatus")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("recStatus"));
            dropdown.findElement(By.xpath("//option[. = 'Active']")).click();
        }
        weBdriver.findElement(By.id("recStatusDate")).click();
        weBdriver.findElement(By.id("recStatusDate")).sendKeys("06/01/2020");
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(5) .save")).click();
        weBdriver.findElement(By.linkText("Investigators")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.switchTo().frame(2);
        weBdriver.findElement(By.id("poID")).click();
        weBdriver.findElement(By.id("poID")).sendKeys("214534");
        {
            WebElement element = weBdriver.findElement(By.cssSelector(".btn:nth-child(1) > .btn_img"));
            Actions builder = new Actions(weBdriver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = weBdriver.findElement(By.cssSelector(".search"));
            Actions builder = new Actions(weBdriver);
            builder.moveToElement(element).release().perform();
        }
        weBdriver.findElement(By.cssSelector(".btn:nth-child(1) > .btn_img")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.switchTo().defaultContent();
        weBdriver.findElement(By.cssSelector(".action:nth-child(6) img")).click();
        weBdriver.findElement(By.linkText("Contact")).click();
        weBdriver.findElement(By.id("personContactWebDTO.telephone")).click();
        weBdriver.findElement(By.id("personContactWebDTO.telephone")).sendKeys("555-555-5555");
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(3) .save")).click();
        weBdriver.findElement(By.linkText("Participating Site")).click();
        weBdriver.findElement(By.cssSelector(".actionsrow:nth-child(5) .save")).click();

        weBdriver.findElement(By.linkText("Participating Sites")).click();
        // End participating Sites
    }
    public void accrualAccess(){//Step 95
        //Accrual
        weBdriver.findElement(By.linkText("Manage Accrual Access")).click();
        weBdriver.findElement(By.cssSelector(".add")).click();
        weBdriver.findElement(By.id("registryUserId")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("registryUserId"));
            dropdown.findElement(By.xpath("//option[. = 'ctrp, qatester1 - ctrpqatester1']")).click();
        }
        weBdriver.findElement(By.id("studySiteId")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("studySiteId"));
            dropdown.findElement(By.xpath("//option[. = 'Novartis Pharmaceuticals']")).click();
        }
        weBdriver.findElement(By.id("manageAccrualAccesscreate_access_statusCode")).click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("manageAccrualAccesscreate_access_statusCode"));
            dropdown.findElement(By.xpath("//option[. = 'Active']")).click();
        }
        weBdriver.findElement(By.cssSelector(".save")).click();
        //
    }
    public void assertActiveTrialStatus(){//Step 96
        assertThat(weBdriver.findElement(By.cssSelector(".float33:nth-child(4) > .row:nth-child(1) > .value")).getText(), is("Active"));
    }
    public void assertProcessingStatus(){//Step 97
        assertThat(weBdriver.findElement(By.cssSelector(".float33:nth-child(4) > .row:nth-child(3) > .value")).getText(), is("Abstraction Verified No Response"));

    }
}

