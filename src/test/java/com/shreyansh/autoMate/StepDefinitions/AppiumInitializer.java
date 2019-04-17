package com.shreyansh.autoMate.StepDefinitions;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import io.appium.java_client.service.local.AppiumDriverLocalService;


import java.io.IOException;
import java.net.URL;

public abstract class AppiumInitializer {

    private static AppiumDriverLocalService service;

    @BeforeSuite
    public void globalSetup () throws IOException {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterSuite
    public void globalTearDown () {
        service.stop();
    }

    public URL getServiceUrl () {
        return service.getUrl();
    }

}
