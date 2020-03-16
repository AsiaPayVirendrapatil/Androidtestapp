package com.asiapay.percentagecalulate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "/Users/virendrapatil/Desktop/Mobilewallet.app");
        desiredCapabilities.setCapability("deviceName", "iPhone 11 (13.3)");
        desiredCapabilities.setCapability("udid", "52633753-526A-4F25-A216-AB31555A22A7");
        desiredCapabilities.setCapability("automationName", "XCUITest");
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("platformVersion", "13.1");
        desiredCapabilities.setCapability("autoDismissAlerts", true);


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Next");
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Auth with Touch ID");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Let's Create One");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("first_name");
        el4.sendKeys("virendra");
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Last_name");
        el5.sendKeys("patil");
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Email_id");
        el6.sendKeys("patil0@gmail.com");
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("mobile_number");
        el7.sendKeys("8605232926");
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("send_otp");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
        el9.sendKeys("1");
        MobileElement el10 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        el10.sendKeys("1");
        MobileElement el11 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField");
        el11.sendKeys("8");
        MobileElement el12 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField");
        el12.sendKeys("3");
        MobileElement el13 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
        el13.sendKeys("4");
        MobileElement el14 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        el14.sendKeys("4");
        MobileElement el15 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField");
        el15.sendKeys("4");
        MobileElement el16 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField");
        el16.sendKeys("4");
        MobileElement el17 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
        el17.sendKeys("4");
        MobileElement el18 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        el18.sendKeys("4");
        MobileElement el19 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeTextField");
        el19.sendKeys("4");
        MobileElement el20 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]/XCUIElementTypeTextField");
        el20.sendKeys("4");
        MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Create my Wallet");
        el21.click();
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Bank");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByAccessibilityId("Scan");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("History");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Home");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"PayYo\"]/XCUIElementTypeButton[1]");
        el27.click();
        //el27.click();

        MobileElement el28 = (MobileElement) driver.findElementByAccessibilityId("Logout");
        el28.click();
        MobileElement el29 = (MobileElement) driver.findElementByAccessibilityId("Login");
        el29.click();
        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("Card");
        el30.click();
        MobileElement el31 = (MobileElement) driver.findElementByAccessibilityId("roundbtn");
        el31.click();
        MobileElement el32 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Mobilewallet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
        el32.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
