package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium09UiSelector {


    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/ayyildiz/IdeaProjects/AppiumTurkish/Apps/gestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(4000);
//UiSelector da ' kullanamiyorsunuz " kullanmak gerekiyor   driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")");
        //resorceId() ile
        // driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();
        // className
        // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")").click();

        //className() text ile beraber
        //  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"Add gesture\")").click();

        //className() index() ile
        //  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(1)").click();

//        List<MobileElement> buttons = driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")");
//        for (MobileElement button : buttons) {
//             if (button.getText().equals("Add gesture")){
//                 button.click();
//                 break;
//             }
//        }

//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textContains(\"load\")").click();
//
//        Thread.sleep(2000);
//
//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textStartsWith(\"Te\")").click();

//UiSelector ile kullanivabilecek methodlar

        System.out.println(driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").checkable(false)").getAttribute("checkable"));

        System.out.println(driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").clickable(true)").getAttribute("clickable"));


    }





}
