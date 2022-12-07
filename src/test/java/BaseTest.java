import core.Driver;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void get() {
        driver = Driver.getDriver();
    }

    @SneakyThrows
    @AfterMethod
    public void quit() {
        Thread.sleep(3000);
        Driver.quitDriver();
    }
}
