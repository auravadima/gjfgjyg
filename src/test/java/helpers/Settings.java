package helpers;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Settings {
    public static AndroidDriver driver;

    public static void initDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "phone");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.UDID, "RWFS454MJK0006913");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.dialer");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.dialer.DialtactsActivity");
        caps.setCapability("noReset","true");
        caps.setCapability("fullReset","false");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WebDriverRunner.setWebDriver(driver);
    }
}
