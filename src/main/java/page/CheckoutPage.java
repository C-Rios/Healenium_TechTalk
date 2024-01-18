package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CheckoutPage {

    // Test data
    private final WebDriver driver;

    // Locators
    private final By firstNameId = By.id("firstName");
    private final By lastNameId = By.id("lastName");
    private final By usernameId = By.id("username");
    private final By emailId = By.id("email");
    private final By firstAddressId = By.id("address");
    private final By secondAddressId = By.id("address2");
    private final By countryId = By.id("country");
    private final By stateId = By.id("state");
    private final By zipId = By.id("zip");
    private final By creditCardNameId = By.id("cc-name");
    private final By creditCardNumberId = By.id("cc-number");
    private final By creditCardExpirationId = By.id("cc-expiration");
    private final By creditCardCvvId = By.id("cc-cvv");
    private final By checkoutButtonXpath = By.xpath("//button[text()='Continue to checkout']");

    // Constructor
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public CheckoutPage inputFirstName(String firstName){
        driver.findElement(firstNameId).sendKeys(firstName);
        return this;
    }

    public CheckoutPage inputLastName(String lastName){
        driver.findElement(lastNameId).sendKeys(lastName);
        return this;
    }

    public CheckoutPage inputUsername(String username) {
        driver.findElement(usernameId).sendKeys(username);
        return this;
    }

    public CheckoutPage inputEmail(String email){
        driver.findElement(emailId).sendKeys(email);
        return this;
    }

    public CheckoutPage inputAddress1(String address1){
        driver.findElement(firstAddressId).sendKeys(address1);
        return this;
    }

    public CheckoutPage inputAddress2(String address2){
        driver.findElement(secondAddressId).sendKeys(address2);
        return this;
    }

    public CheckoutPage selectCountry(String country){
        new Select(driver.findElement(countryId)).selectByVisibleText(country);
        return this;
    }

    public CheckoutPage selectState(String state){
        new Select(driver.findElement(stateId)).selectByVisibleText(state);
        return this;
    }

    public CheckoutPage inputZip(String zip){
        driver.findElement(zipId).sendKeys(zip);
        return this;
    }

    public CheckoutPage inputCreditCardName(String name){
        driver.findElement(creditCardNameId).sendKeys(name);
        return this;
    }

    public CheckoutPage inputCreditCardNumber(String number){
        driver.findElement(creditCardNumberId).sendKeys(number);
        return this;
    }

    public CheckoutPage inputCreditCardExpiration(String expiration){
        driver.findElement(creditCardExpirationId).sendKeys(expiration);
        return this;
    }

    public CheckoutPage inputCreditCardCvv(String cvv){
        driver.findElement(creditCardCvvId).sendKeys(cvv);
        return this;
    }

    public void clickCheckoutButton(){
        driver.findElement(checkoutButtonXpath).sendKeys(Keys.RETURN);
    }
}
