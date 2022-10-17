package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {

    // we have pre and post condition in Hooks
    @Before
    public void start(){
       //setUp();
    }



    @After
    public void end(){
   //tearDown();




    }

}
