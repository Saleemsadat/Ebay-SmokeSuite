package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDelete2 extends CommonMethods {


    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    public WebElement addUserButton;

    @FindBy(name = "FirstName")
    public WebElement firstname;

    public AddDelete2() {
        PageFactory.initElements(driver,this);
    }
}
