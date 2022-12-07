package pages;

import enums.WidgetsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends Base {

    public void selectWidget(WidgetsConstants widget) {
        String xpath = String.format("//h5[text()='%s']/ancestor::div[@class='card mt-4 top-card']", widget.getWidgetName());
        WebElement elementLocator = driver.findElement(By.xpath(xpath));
        elementLocator.click();
    }

    public void getUrl() {
        baseUrl = "https://demoqa.com/";
        driver.get(baseUrl);
    }
}
