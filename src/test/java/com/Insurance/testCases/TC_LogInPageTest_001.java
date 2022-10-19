package com.Insurance.testCases;

import com.Insurance.base.BaseClass;
import com.Insurance.webPages.LoginPage;
import org.testng.annotations.Test;

public class TC_LogInPageTest_001 extends BaseClass {

   public LoginPage lP;

    @Test(priority = 0)
    public void emailTest(){
        lP =new LoginPage(driver);
        lP.email();
    }
    @Test(priority = 1)
    public void passwordTest(){
        lP =new LoginPage(driver);
        lP.password();
    }
    @Test(priority = 2)
    public void clickLogInTest(){
        lP=new LoginPage(driver);
        lP.clickLogIn();
    }
    @Test(priority = 3)
    public void clickReqQuotationTest(){
        lP=new LoginPage(driver);
        lP.clickRequestQuotation();
    }
    @Test(priority = 4)
    public void breakDownCoverClickTest(){
        lP=new LoginPage(driver);
        lP.breakDownCoverClick();
    }
    @Test(priority = 5)
    public void windScreenRepairTest(){
        lP=new LoginPage(driver);
        lP.windScreenRepair();
    }
    @Test(priority = 6)
    public void incedentsTest(){
        lP=new LoginPage(driver);
        lP.incedents();
    }
    @Test(priority = 7)
    public void registrationTest(){
        lP=new LoginPage(driver);
        lP.registration();
    }
    @Test(priority = 8)
    public void annualmileageTest(){
        lP=new LoginPage(driver);
        lP.annualmileage();
    }
    @Test(priority = 9)
    public void estimatedValueTest(){
        lP=new LoginPage(driver);
        lP.estimatedValue();
    }
    @Test(priority = 10)
    public void parkingLocationTest(){
        lP=new LoginPage(driver);
        lP.parkingLocation();
    }
    @Test(priority = 11)
    public void startOfPolicyYearTest(){
        lP=new LoginPage(driver);
        lP.startOfPolicyYear();
    }
    @Test(priority = 12)
    public void startOfPolicyMonthTest(){
        lP=new LoginPage(driver);
        lP.startOfPolicyMonth();
    }
    @Test(priority = 13)
    public void startOfPolicydateTest(){
        lP=new LoginPage(driver);
        lP.startOfPolicydate();
    }
    @Test(priority = 14)
    public void clickSubmitQuotationTest(){
        lP=new LoginPage(driver);
        lP.clickSubmitQuotation();
    }
}
