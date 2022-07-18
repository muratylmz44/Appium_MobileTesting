package Appium;

import TestBase.AppiumBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;

public class Appium11 extends AppiumBase {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

        driver.findElementByXPath("//*[@text='3. Preference dependencies']").click();




        // check box a gore kosul


        String isCheck = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").checkable(true)").getAttribute("checked");

        if (isCheck.equals("false")){

            driver.findElementById("android:id/checkbox").click();

            Thread.sleep(2000);
        }






//
//

        //Wifi settings e gore
       /* List<MobileElement> list = driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"WiFi settings\").enabled(false)");
        if (list.size() > 0) {
            String isEnabled = driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"WiFi settings\").enabled(false)").getAttribute("enabled");
            if (isEnabled.equals("false")) {
                driver.findElementById("android:id/checkbox").click();
            }



        }

        */
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(2000);
        driver.findElementById("android:id/edit").sendKeys("test");
        Thread.sleep(2000);
        driver.findElementById("android:id/button1").click();



        driver.quit();



    }
}

