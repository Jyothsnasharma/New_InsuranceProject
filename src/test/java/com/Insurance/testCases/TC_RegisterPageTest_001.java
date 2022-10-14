package com.Insurance.testCases;

import com.Insurance.base.BaseClass;
import com.Insurance.webPages.RegisterPage;
import org.testng.annotations.Test;

public class TC_RegisterPageTest_001  extends BaseClass {

    public RegisterPage rp;
    @Test(priority = 0)
     public void registerTest(){
        rp=new RegisterPage(driver);
         rp.clickRegisterButton();
     }
    @Test(priority = 1)
     public  void registerTitleTest(){
        rp=new RegisterPage(driver);
         rp.selectTitle();
     }
    @Test(priority = 2)
    public  void registerFirstNameTest() {
        rp = new RegisterPage(driver);
        rp.firstName();
    }
    @Test(priority = 3)
    public void registerSurnameTest(){
        rp = new RegisterPage(driver);
        rp.surName();
    }
    @Test(priority = 4)
    public void registerPhoneNoTest(){
        rp=new RegisterPage(driver);
        rp.phoneNo();
    }
    @Test(priority = 5)
    public void registerDateOfBirthTest(){
        rp =new RegisterPage(driver);
        rp.dateOfBirth();
    }
    @Test(priority = 6)
    public void registerLicenceTypeTest(){
        rp =new RegisterPage(driver);
        rp.licenceType();
    }
    @Test(priority =7)
    public void registerLicencePeriodTest(){
        rp =new RegisterPage(driver);
        rp.licencePeriod();
    }
    @Test(priority = 8)
    public void registerOccupationTest(){
        rp =new RegisterPage(driver);
        rp.occupation();
    }
    @Test(priority = 9)
    public void registerAddressStreetTest(){
        rp =new RegisterPage(driver);
        rp.addressStreet();
    }
    @Test(priority = 10)
    public void registerAddressCityTest(){
        rp =new RegisterPage(driver);
        rp.addressCity();
    }
    @Test(priority = 11)
    public void registerAddressCountryTest(){
        rp =new RegisterPage(driver);
        rp.addressCountry();
    }
    @Test(priority = 12)
     public void registerAddressPostCodeTest(){
         rp =new RegisterPage(driver);
         rp.addressPostCode();
     }
    @Test(priority = 13)
     public void registerEmailTest(){
         rp =new RegisterPage(driver);
         rp.email();;
     }
    @Test(priority = 14)
    public void registerPasswordTest(){
        rp =new RegisterPage(driver);
        rp.password();;
    }
    @Test(priority = 15)
    public void registerConfirmPasswordTest(){
        rp =new RegisterPage(driver);
        rp.confirmPassword();
    }
    @Test(priority = 16)
    public void registerClickCreateTest(){
        rp =new RegisterPage(driver);
        rp.clickCreateButton();
    }

}
