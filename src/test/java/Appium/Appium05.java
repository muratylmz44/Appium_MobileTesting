package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium05 {


    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "germanmugatPhone");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\pc1\\IdeaProjects\\MobileTesting\\src\\Apps\\Calculator.apk");

        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);


        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);


        Thread.sleep(3000);


        AndroidElement num0= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_0");
        AndroidElement num1= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_1");
        AndroidElement num2= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_2");
        AndroidElement num3= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_3");
        AndroidElement num4= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_4");
        AndroidElement num5= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_5");
        AndroidElement num6= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_6");
        AndroidElement num7= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_7");
        AndroidElement num8= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_8");
        AndroidElement num9= (AndroidElement) driver.findElementById("com.google.android.calculator:id/digit_9");


        AndroidElement carpma= (AndroidElement) driver.findElementById("com.google.android.calculator:id/op_mul");
        AndroidElement esit= (AndroidElement) driver.findElementById("com.google.android.calculator:id/eq");



        num1.click();
        num5.click();
        carpma.click();
        num3.click();


        String expectedResult=driver.findElementById("com.google.android.calculator:id/result_preview").getText();

        Assert.assertEquals(expectedResult,"45");

        esit.click();

        Thread.sleep(2000);

        String actualResult=driver.findElementById("com.google.android.calculator:id/result_final").getText();

        Assert.assertEquals(expectedResult,actualResult);

        System.out.println("expected"+expectedResult);
        System.out.println("Actual"+actualResult);


    }
}