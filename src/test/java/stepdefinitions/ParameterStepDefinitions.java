package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParameterStepDefinitions {
    @Given("Bu parametreli bir stepdir ve değeri {string}")
    public void bu_parametreli_bir_stepdir_ve_değeri(String string) {
        System.out.println("step imizde " + string + " değeri okundu");
    }

}
