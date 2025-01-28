package com.belajartestng.authentication;

import com.belajartestng.drivers.DriverSingleton;
import com.belajartestng.drivers.utilities.BrowserType;
import com.belajartestng.pages.auth.CatPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CatChangeTest {
    private CatPage catPage;
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = DriverSingleton.getDriver(BrowserType.CHROME);
        catPage = new CatPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testCatChange() throws InterruptedException{
        catPage.editKategoriKesehatan("Obat");
    }
}
