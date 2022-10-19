package com.Insurance.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
    this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Elements Locators
    @FindBy(how= How.ID,using="email")
    WebElement email;
    @FindBy(how= How.NAME,using ="password")
    WebElement password;

    @FindBy(how=How.XPATH,using = "//input[@class='btn btn-default']")
    WebElement logIn;
   // @FindBy(how=How.CLASS_NAME,using = "btn btn-default")
    // WebElement logIn;

    //Validation Elements
    @FindBy(how=How.XPATH,using = "//div[@class='content']")
    WebElement signedInAs;
    @FindBy(how = How.XPATH,using = "//a[@href='#tabs-1']")
    WebElement home;
    @FindBy(how=How.XPATH,using = "//input[@class='btn btn-danger']")
    WebElement logOut;
    @FindBy(how=How.XPATH,using = "//h4[text()='abc@gmail.com']")
    WebElement displayEmail;

    //Request Quotation Locators
    @FindBy(how=How.XPATH,using = "//a[@id='ui-id-2']")
    WebElement reqQuotationTab;
    @FindBy(how=How.XPATH,using = "//h2[text()='Request a quotation']")
    WebElement reqQuotationtxt;
    @FindBy(how=How.XPATH,using = "//input[@name='submit']")
    WebElement saveQuotation;
    @FindBy(how=How.ID,using = "quotation_breakdowncover")
    WebElement breakDownCover;
    @FindBy(how=How.ID,using = "quotation_windscreenrepair_t")
    WebElement windScreenRepair;
    @FindBy(how=How.ID,using = "quotation_incidents")
    WebElement incidents;
    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_registration")
    WebElement registration;

    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_mileage")
    WebElement mileage;

    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_value")
    WebElement estimatedValue;

    @FindBy(how = How.ID,using = "quotation_vehicle_attributes_parkinglocation")
    WebElement parkingLocation;

    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_policystart_1i")
    WebElement startOfPolicyYear;

    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_policystart_3i")
    WebElement startOfPolicydate;

    @FindBy(how=How.ID,using = "quotation_vehicle_attributes_policystart_2i")
    WebElement startOfPolicyMonth;


    //saveQuotation locators
    @FindBy(how = How.XPATH,using = "//b[text()='You have saved this quotation!']")
    WebElement quotationConformationMessage;
    public void email(){
        email.sendKeys("abc@gmail.com");
    }

    public void password(){
        password.sendKeys("Hi");
    }

    public void clickLogIn(){
        logIn.click();
        //Assert.assertEquals(signedInAs.getText(),"Signed in as");
        Assert.assertEquals(home.getText(),"Home");
        Assert.assertTrue(logOut.isDisplayed());
        Assert.assertEquals(displayEmail.getText(),"abc@gmail.com");
    }

    public void clickRequestQuotation(){
    reqQuotationTab.click();
    Assert.assertTrue(reqQuotationtxt.isDisplayed());
    Assert.assertTrue(saveQuotation.isDisplayed());
    }

    public void breakDownCoverClick(){
        breakDownCover.click();
        Select breakDownCoverValue=new Select(breakDownCover);
        breakDownCoverValue.selectByValue("2");
    }
    public void windScreenRepair(){
        windScreenRepair.click();
    }
    public void incedents()
    {
        incidents.sendKeys("Accident");

    }
    public void registration(){
        registration.sendKeys("5468");
    }
    public void annualmileage(){
        mileage.sendKeys("456");

    }
    public void estimatedValue(){
        estimatedValue.sendKeys("25000");
    }
    public void parkingLocation(){
        parkingLocation.click();
        Select parkindLocationValue=new Select(parkingLocation);
        parkindLocationValue.selectByValue("Road");

    }
    public void startOfPolicyYear(){
        startOfPolicyYear.click();
        Select startOfPolicyYearValue=new Select(startOfPolicyYear);
        startOfPolicyYearValue.selectByValue("2022");
    }
    public void startOfPolicyMonth(){
        startOfPolicyMonth.click();
        Select startOfPolicyMonthValue=new Select(startOfPolicyMonth);
        startOfPolicyMonthValue.selectByValue("10");
    }
    public void startOfPolicydate(){
        startOfPolicydate.click();
        Select starOfPolicydateValue=new Select(startOfPolicydate);
        starOfPolicydateValue.selectByValue("3");
    }
    public void clickSubmitQuotation(){
        saveQuotation.click();
        Assert.assertTrue(quotationConformationMessage.isDisplayed());
    }


}
