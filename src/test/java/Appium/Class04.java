package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class04 {



    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        //setCapability() metodunu farkli sekillerde yazabilirsiniz

        //1. de Capabilitiy Selenium library den almakta
        //2.direk Key Value şeklinde
        //3.Appium.io dan almakta

        // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");

        //  desiredCapabilities.setCapability("platformname","Android");


        //setCapability() metodunu farkli sekillerde yazabilirsiniz
        // desiredCapabilities.setCapability("automationName","UiAutomator2");
        //        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        //https://appium.io/docs/en/writing-running-appium/caps/index.html
        //gerekli bilgiler detayli olarak linkte var

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

        // Devicename Android te önemli değil İOS ta Önemli
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"germanmugatPhone");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\pc1\\IdeaProjects\\MobileTesting\\src\\Apps\\gestureTool.apk");


        //tekrar tekrar app i kurulumunu yapmaz 1 kez yüklenir ve açar
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);



        /*
        eger telefon kullanmak istiyorsaniz developer options aktif hale getirlemeli ve USB Debugging acik olmali
        USB vasitasiyle gercek telefonlardada test yapabilirsiniz
         */

        Thread.sleep(5000);



        //http://localhost:4723/wd/hub
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);


        Thread.sleep(3000);


        driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();

        Thread.sleep(2000);

        driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("Phone");


        driver.findElementById("com.davemac327.gesture.tool:id/gestures_overlay").click();


        Thread.sleep(2000);



        driver.findElementById("com.davemac327.gesture.tool:id/done").click();
        Thread.sleep(2000);





        String expectedText ="Phone";


       // String actualText = driver.findElementByXPath("//android.widget.TextView[@text='test']").getText();
       // Assert.assertEquals(actualText,expectedText);


        Thread.sleep(2000);
        String actualText = driver.findElementByXPath("//android.widget.TextView[@text='Phone']").getText();

        Assert.assertEquals(expectedText,actualText);













        driver.quit();











    }




}
