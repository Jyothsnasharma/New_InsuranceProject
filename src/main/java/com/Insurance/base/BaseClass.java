package com.Insurance.base;

import com.Insurance.utilities.ReadConfig;
import com.Insurance.webPages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
  public static WebDriver driver;
  ReadConfig rc=new ReadConfig();

  public String baseUrl=rc.getApplicationUrl();

    @BeforeClass
    public void setup()  {

        System.setProperty("webdriver.chrome.driver",rc.getChromePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);


    }

    //Quit Chrome Driver
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }
}
