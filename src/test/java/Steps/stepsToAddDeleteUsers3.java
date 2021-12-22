package Steps;

import Pages.AddDelete3;
import Utils.CommonMethods;
import io.cucumber.java.en.When;

public class stepsToAddDeleteUsers3 extends CommonMethods {




    @When("Engr Candidate enters the candidate information")
    public void engr_candidate_enters_the_candidate_information() {
        AddDelete3 obj = new AddDelete3();
        sendText(obj.lastname, "How");
        sendText(obj.username, "wala");
        sendText(obj.password, "123456");

    }
}
