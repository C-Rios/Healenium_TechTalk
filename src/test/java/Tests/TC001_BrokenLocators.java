package Tests;

import Repository.BrokenLocators;
import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_BrokenLocators {
    private SelfHealingDriver driver;

    private BrokenLocators locatorsRepository;

    @BeforeTest
    public void setup(){
        //System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        //Driver initialization
        driver = SelfHealingDriver.create(new ChromeDriver());
        Reporter.log("Driver initialized");
        int maxImplicitWait = 10;
        //Window is set to its maximum size
        driver.manage().window().maximize();
        Reporter.log("Window size se to its max");
        //Navigation to the site
        driver.get("https://elenastepuro.github.io/test_env/index.html");
        Reporter.log("Navigated successfuly to the site");

        locatorsRepository = new BrokenLocators(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        Reporter.log("Test finished correctly");
    }

    @Test
    public void accessCompanyItemInNavBar(){
        locatorsRepository.getField1().click();
        locatorsRepository.getField1().sendKeys("This is a test for the id selector");

        locatorsRepository.getField2().click();
        locatorsRepository.getField2().sendKeys("This is a test for the classname selector");

        //locatorsRepository.getField3().click();
        //locatorsRepository.getField3().sendKeys("This is a test for the tag name");

        locatorsRepository.getField4().click();
        locatorsRepository.getField4().sendKeys("This is a test for the text box selector");

        locatorsRepository.getField5().click();
        locatorsRepository.getField5().sendKeys("This is a test for the name selector");

        locatorsRepository.getField6().click();
        locatorsRepository.getField6().sendKeys("This is a test for the attribute selector");
        driver.quit();

    }
}
