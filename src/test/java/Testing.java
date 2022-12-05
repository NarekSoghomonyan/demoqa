import enums.Elements;
import enums.Widgets;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementPage;
import pages.LandingPage;

public class Testing extends BaseTest {
    LandingPage homePage;
    ElementPage elementPage;

    @BeforeMethod
    public void initElements() {
        homePage = new LandingPage();
        elementPage = new ElementPage();
    }

    @Test
    public void test() {
        homePage.selectWidget(Widgets.ELEMENTS);
        elementPage.selectElement(Elements.BUTTONS);
    }
}
