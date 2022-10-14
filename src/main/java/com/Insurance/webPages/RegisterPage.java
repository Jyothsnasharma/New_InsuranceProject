package com.Insurance.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage {
 public WebDriver driver;

 public RegisterPage(WebDriver driver){
     this.driver=driver;
     PageFactory.initElements(driver,this);
 }
  @FindBy(how= How.XPATH,using = "//a[@class='btn btn-default']")
    WebElement registerButton;

    @FindBy(how=How.XPATH,using="//h1")
    WebElement header;
    @FindBy(how=How.XPATH,using ="//a[@href='index.php']")
    WebElement loginButton;
    @FindBy(how=How.ID,using = "user_title")
    WebElement title;
    @FindBy(how=How.ID,using = "user_firstname")
    WebElement firstName;
    @FindBy(how=How.NAME,using = "lastname")
    WebElement lastName;
    @FindBy(how=How.NAME,using = "phone")
    WebElement phone;
    @FindBy(how=How.NAME,using = "year")
    WebElement year;
    @FindBy(how = How.NAME,using = "month")
    WebElement month;
    @FindBy(how=How.NAME,using ="date")
    WebElement date;
    @FindBy(how=How.NAME,using = "licencetype")
    WebElement licenceType;
    @FindBy(how=How.ID,using = "user_licenceperiod")
    WebElement licencePeriod;
    @FindBy(how=How.ID,using = "user_occupation_id")
    WebElement occupation;
    @FindBy(how=How.ID,using = "user_address_attributes_street")
    WebElement addressStreet;
    @FindBy(how=How.ID,using = "user_address_attributes_city")
    WebElement addressCity;
    @FindBy(how=How.ID,using = "user_address_attributes_county")
    WebElement addressCountry;
    @FindBy(how=How.ID,using = "user_address_attributes_postcode")
    WebElement addressPostCode;
    @FindBy(how=How.ID,using = "user_user_detail_attributes_email")
    WebElement eMail;
    @FindBy(how=How.ID,using = "user_user_detail_attributes_password")
    WebElement passWord;
    @FindBy(how=How.ID,using = "user_user_detail_attributes_password_confirmation")
    WebElement confirmPassword;
    @FindBy(how=How.NAME,using = "submit")
    WebElement create;
    @FindBy(how=How.XPATH,using = "//h3")
    WebElement login;
    @FindBy(how=How.XPATH,using = "//label[text()='Email']")
    WebElement emailLabel;


 public void clickRegisterButton(){
     registerButton.click();
     Assert.assertTrue(driver.getCurrentUrl().contains("register.php"));
     Assert.assertEquals(header.getText(),"Sign up as a new user");
     Assert.assertTrue(loginButton.isDisplayed());
 }

 public void selectTitle(){
       title.click();
     Select titleValue=new Select(title);
     titleValue.selectByValue("Doctor");
 }
 public void firstName(){
     firstName.sendKeys("Jyothsna");
 }
 public void surName(){
     lastName.sendKeys("Tadikonda");
 }
 public void phoneNo(){
     phone.sendKeys("8888888888");

 }

    public void dateOfBirth() {
     year.click();
     Select yearValue=new Select(year);
     yearValue.selectByValue("1987");

        month.click();
        Select monthValue=new Select(month);
        monthValue.selectByValue("4");

        date.click();
        Select dateValue=new Select(date);
        dateValue.selectByValue("12");

    }

    public void licenceType(){
     licenceType.click();
    }
    public void licencePeriod(){
   licencePeriod.click();
   Select licencePeriodValue=new Select(licencePeriod);
   licencePeriodValue.selectByValue("3");

    }

    public void occupation() {
        occupation.click();
        Select occupationValue=new Select(occupation);
        occupationValue.selectByValue("4");
    }
    public void addressStreet(){
     addressStreet.sendKeys("Sundial Court");
    }
    public void addressCity(){
     addressCity.sendKeys("Richmond");
    }
    public void addressCountry(){
        addressCountry.sendKeys("USA");
    }
    public void addressPostCode(){
        addressPostCode.sendKeys("23295");
    }
    public void email(){
        eMail.sendKeys("abc@gmail.com");
    }
    public void password(){
        passWord.sendKeys("abc");
    }
    public void confirmPassword(){
        confirmPassword.sendKeys("abc");
    }
    public void clickCreateButton(){
     create.click();
     Assert.assertTrue(driver.getCurrentUrl().contains("insurance/v1/index.php"));
     Assert.assertEquals(login.getText(),"Login");
     Assert.assertEquals(emailLabel.getText(),"Email");
    }

}
