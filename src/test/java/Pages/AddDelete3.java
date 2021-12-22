package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDelete3 extends CommonMethods {


    @FindBy(name = "LastName")
    public WebElement lastname;

    @FindBy(name = "UserName")
    public WebElement username;

    @FindBy(name = "Password")
    public WebElement password;

    public AddDelete3() {
        PageFactory.initElements(driver,this);
    }

}

