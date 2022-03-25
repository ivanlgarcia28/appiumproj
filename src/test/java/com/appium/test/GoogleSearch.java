package com.appium.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GoogleSearch {

    public AndroidDriver driverAndroid;
    By searchbox = By.name("q");
    By firstResult = By.xpath("//a[contains(@href, 'https://www.selenium.dev')][1]");
    
    @BeforeTest
    void setUp(){
        try{
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("udid", "ZY223CGB6T");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "7.0");
            cap.setCapability("browserName", "Chrome");
            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driverAndroid = new AndroidDriver(url, cap);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Test
    void GoogleSearchTest() throws InterruptedException{
        driverAndroid.get("https://www.google.com.ar");
        driverAndroid.findElement(searchbox).sendKeys("Selenium.com");
        driverAndroid.findElement(searchbox).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driverAndroid.findElement(firstResult).click();
        Assert.assertEquals(driverAndroid.getTitle(), "Selenium");
    }

    @AfterTest
    void teardDown(){
        driverAndroid.close();
        driverAndroid.quit();
    }

    
}
