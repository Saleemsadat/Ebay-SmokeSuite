package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

    // we have pre and post condition in Hooks
    @Before
    public void start(){
      Amazon.runAmazon();
    }

    @After
    public void end(Scenario scenario){




    }

}
