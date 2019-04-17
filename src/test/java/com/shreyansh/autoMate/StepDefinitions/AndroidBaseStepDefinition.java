package com.shreyansh.autoMate.StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class AndroidBaseStepDefinition extends AppiumInitializer {
    public AndroidDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../apps");
        File app = new File(appDir.getCanonicalPath(), "jp.ne.paypay.android.app_2019-04-15.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver<WebElement>(getServiceUrl(), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
