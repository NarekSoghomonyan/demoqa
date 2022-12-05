package pages;

import enums.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementPage extends Base {
    public void selectElement(Elements element) {
        String xpath = String.format("//span[text()='%s']/..",element.getElementName());
        WebElement elementLocator = driver.findElement(By.xpath(xpath));
        elementLocator.click();
    }
}
