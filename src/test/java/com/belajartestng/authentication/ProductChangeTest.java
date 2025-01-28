package com.belajartestng.authentication;

import com.belajartestng.drivers.DriverSingleton;
import com.belajartestng.drivers.utilities.BrowserType;
import com.belajartestng.pages.auth.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductChangeTest {

    private WebDriver driver;
    private ProductPage productPage;

    @BeforeClass
    public void setup(){
        driver = DriverSingleton.getDriver(BrowserType.CHROME);
        productPage = new ProductPage(driver);
    }

    @Test
    public void testProductChange() throws InterruptedException {
        productPage.changeProduct();
        productPage.clearFieldTitle("Ketoconazole 10mg");
        productPage.clearFieldPrice("16000");
        productPage.clearFieldStock("1200");
        productPage.clickBtnSaveAddAnother();
    }
}
