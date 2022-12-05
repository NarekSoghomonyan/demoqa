package pages;

import enums.Widgets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends Base {

    public void selectWidget(Widgets widget){
        String xpath = String.format("//h5[text()='%s']/ancestor::div[@class='card mt-4 top-card']",widget.getWidgetName()) ;
        WebElement elementLocator = driver.findElement(By.xpath(xpath));
        elementLocator.click();
    }
}
