package com.appium.test;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {

    public AndroidDriver driverAndroid;
    By nro2 = By.id("com.google.android.calculator:id/digit_2");
    By mas = By.id("com.google.android.calculator:id/op_add");
    By equals = By.id("com.google.android.calculator:id/eq");
    @BeforeTest
    void setUp(){
        try{
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("udid", "ZY223CGB6T");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "7.0");
            cap.setCapability("appPackage", "com.google.android.calculator");
            cap.setCapability("appActivity", "com.android.calculator2.Calculator");
            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driverAndroid = new AndroidDriver(url, cap);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Test
    void CalculatorTest(){
        driverAndroid.findElement(nro2).click();
        driverAndroid.findElement(mas).click();
        driverAndroid.findElement(nro2).click();
        driverAndroid.findElement(equals).click();
    }

    @AfterTest
    void teardDown(){
        driverAndroid.close();
        driverAndroid.quit();
    }
    
}
