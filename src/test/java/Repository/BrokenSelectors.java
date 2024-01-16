package Repository;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenSelectors {
    private WebElement offers;
    public BrokenSelectors(SelfHealingDriver driver)
    {
        this.offers = driver.findElement(By.name("q"));
    }

    public WebElement getOffers() {
        return offers;
    }

    public void setOffers(WebElement offers) {
        this.offers = offers;
    }
}
