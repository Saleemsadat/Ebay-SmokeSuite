package Steps;

import Pages.AddDelete2;
import Utils.CommonMethods;
import io.cucumber.java.en.When;

public class stepsToAddDeleteUsers2 extends CommonMethods {

    @When("I click on add button at the top right corner")
    public void i_click_on_add_button_at_the_top_right_corner() throws InterruptedException {
        AddDelete2 obj = new AddDelete2();
        click(obj.addUserButton);
        Thread.sleep(2000);
        sendText(obj.firstname, "Bob");
    }
}
