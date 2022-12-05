import core.Driver;
import lombok.SneakyThrows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void get(){
        Driver.getDriver();
    }

    @SneakyThrows
    @AfterMethod
    public void quit(){
        Thread.sleep(3000);
        Driver.quitDriver();
    }
}
