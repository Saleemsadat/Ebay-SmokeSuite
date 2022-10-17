package Steps;

import Pages.EbayLoginPage;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class stepsEbayLogin extends CommonMethods {





    @Given("user is on Ebay website")
    public void user_is_on_ebay_website() {
        setUp();
    }


    @When("user clicks on login")
    public void user_clicks_on_login() {
        EbayLoginPage loginPage = new EbayLoginPage();
        click(loginPage.sigIn);


    }
    @Then("user should be able to see the text Please verify yourself under which there should be ebay Captcha")
    public void user_should_be_able_to_see_the_text_under_which_there_should_be_ebay_captcha() {
        EbayLoginPage obj = new EbayLoginPage();

      getText(obj.textToveriy);

        Assert.assertEquals("Please verify yourself", "Please verify yourself");


    }



}
