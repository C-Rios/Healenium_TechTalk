import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.TestExecutionListener;

import static util.driver.DriverHolder.setDriver;

/**
 * Project Name    : healenium-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/17/2021
 * Time            : 7:20 PM
 * Description     :
 **/

@Listeners(TestExecutionListener.class)
public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\camdelos\\Documents\\Craft\\Auto-Healing\\healenium-demo\\src\\drivers\\chromedriver.exe");
        WebDriver delegate = new ChromeDriver();
        setDriver(delegate);
        driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
        driver.navigate().to(getClass().getClassLoader().getResource("checkout/index.html"));
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
