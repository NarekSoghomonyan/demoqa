package pages;

import core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {
     protected WebDriver driver;
     public String baseUrl;
     public String urlPath;

    public Base() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl() {
        return baseUrl + urlPath;
    }


}
