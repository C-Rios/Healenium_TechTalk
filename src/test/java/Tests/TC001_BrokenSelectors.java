package Tests;

import Repository.BrokenSelectors;
import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_BrokenSelectors {

    private SelfHealingDriver driver;

    private BrokenSelectors pageSelectors;

    @BeforeTest
    public void setup() throws InterruptedException {
        //declare delegate
        WebDriver delegate = new ChromeDriver();
        //create Self-healing driver
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        pageSelectors = new BrokenSelectors(driver);

        Thread.sleep(15000);
    }

    @Test
    public void selectorsTest(){
        pageSelectors.getOffers().click();
        pageSelectors.getOffers().sendKeys("whatever");
        pageSelectors.getOffers().sendKeys(Keys.RETURN);
    }
}

