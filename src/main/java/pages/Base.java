package pages;

import core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {
    protected WebDriver driver;

    Base() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        String baseUrl = "https://demoqa.com/";
        driver.get(baseUrl);
    }
}
