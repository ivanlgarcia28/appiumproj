package com.appium.test;

import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.ios.IOSDriver;
import javafx.scene.text.Text;

public class BaseClass {
    
    public BaseClass(AndroidDriver driverAndroid) {
        this.driverAndroid = driverAndroid;
        this.driverIOS = driverIOS;
        this.driverAppium= driverAppium;
    }

    public AndroidDriver driverAndroid;
    public WebDriverWait wait;
    public IOSDriver driverIOS;
    public AppiumDriver driverAppium;

    // void AndroidSetUpDefinition(string appPackage, string appActivity){
    //     try{
    //         DesiredCapabilities AndroidCap = new DesiredCapabilities();
    //         AndroidCap.setCapability("udid", "ZY223CGB6T");
    //         AndroidCap.setCapability("platformName", "Android");
    //         AndroidCap.setCapability("platformVersion", "7.0");
    //         AndroidCap.setCapability("appPackage", appPackage);
    //         AndroidCap.setCapability("appActivity", appActivity);
    //         URL url = new URL("http://0.0.0.0:4723/wd/hub");
    //         driverAndroid = new AndroidDriver(url, AndroidCap);
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    // }

    // void iOSSetUpDefinition(string appPackage, string appActivity){
    //     try{
    //         DesiredCapabilities iOSCap = new DesiredCapabilities();
    //         iOSCap.setCapability("udid", "ZY223CGB6T");
    //         iOSCap.setCapability("platformName", "Android");
    //         iOSCap.setCapability("platformVersion", "7.0");
    //         iOSCap.setCapability("appPackage", appPackage);
    //         iOSCap.setCapability("appActivity", appActivity);
    //         URL url = new URL("http://0.0.0.0:4723/wd/hub");
    //         driverIOS = new IOSDriver(url, iOSCap);
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
}
