import enums.WidgetsConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import pages.widgets.AlertsFrameAndWindows;
import pages.widgets.ElementsPage;
import pages.widgets.FormsPage;
import pages.widgets.Widgets;

public class Testing extends BaseTest {
    LandingPage landingPage;
    ElementsPage elementPage;
    FormsPage formsPage;
    AlertsFrameAndWindows alertsFrameAndWindows;
    Widgets widgets;

    @BeforeMethod
    public void initElements() {
        landingPage = new LandingPage();
        elementPage = new ElementsPage();
        formsPage = new FormsPage();
        alertsFrameAndWindows = new AlertsFrameAndWindows();
        widgets = new Widgets();
    }

    @Test
    public void test() {
        landingPage.getUrl();
        System.out.println(landingPage.baseUrl+ "  baseUrl" );
        System.out.println(elementPage.getCurrentUrl()+"  baseUrl + urlPath");
        System.out.println(landingPage.urlPath+ "  urlPath" );

    }
}
