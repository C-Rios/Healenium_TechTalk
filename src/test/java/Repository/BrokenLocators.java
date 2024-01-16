package Repository;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLocators {
    @FindBy(id = "change_id")
    private WebElement field1;

    @FindBy(className = "test_class")
    private WebElement field2;

    @FindBy(css = "#descendant_change > test_tag")
    private WebElement field3;

    @FindBy(id = "change_enabled")
    private WebElement field4;

    @FindBy(name = "change_name")
    private WebElement field5;

    @FindBy(css = "#change_links[href=\"https://healenium.io/\"]")
    private WebElement field6;

    @FindBy(css = "button#Submit")
    private WebElement button;

    public BrokenLocators(SelfHealingDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getField1() {
        return field1;
    }

    public void setField1(WebElement field1) {
        this.field1 = field1;
    }

    public WebElement getField2() {
        return field2;
    }

    public void setField2(WebElement field2) {
        this.field2 = field2;
    }

    public WebElement getField3() {
        return field3;
    }

    public void setField3(WebElement field3) {
        this.field3 = field3;
    }

    public WebElement getField4() {
        return field4;
    }

    public void setField4(WebElement field4) {
        this.field4 = field4;
    }

    public WebElement getField5() {
        return field5;
    }

    public void setField5(WebElement field5) {
        this.field5 = field5;
    }

    public WebElement getField6() {
        return field6;
    }

    public void setField6(WebElement field6) {
        this.field6 = field6;
    }

    public WebElement getButton() {
        return button;
    }

    public void setButton(WebElement button) {
        this.button = button;
    }
}
