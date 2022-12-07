package pages.widgets;

import enums.Elements;
import enums.WidgetsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementsPage extends WidgetPage {
    public void selectElement(Elements element) {
        String xpath = String.format("//span[text()='%s']/..",element.getElementName());
        WebElement elementLocator = driver.findElement(By.xpath(xpath));
        elementLocator.click();

    }

    @Override
    WidgetsConstants getWidget() {
        return WidgetsConstants.ELEMENTS;
    }

}
