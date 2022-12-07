package pages.widgets;

import enums.Forms;
import enums.WidgetsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormsPage extends WidgetPage {

    public void selectForms(Forms forms){
        String xpath = String.format("//span[text()='%s']/..",forms.getFormName());
        WebElement elementLocator = driver.findElement(By.xpath(xpath));
        elementLocator.click();
    }
    @Override
    WidgetsConstants getWidget() {
        return WidgetsConstants.FORMS;
    }
}
