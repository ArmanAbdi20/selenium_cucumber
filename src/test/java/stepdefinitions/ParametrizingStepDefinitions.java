package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearchPageTask;
import utils.Driver;

public class ParametrizingStepDefinitions {
    @Given("Kullanıcı google sayfasına gider")
    public void kullanıcıGoogleSayfasınaGider() {
        Driver.getDriver().get("http://www.google.com");
    }

    @When("Kullanıcı arama kısmına cucumber girdiğinde")
    public void kullanıcıAramaKısmınaCucumberGirdiğinde() {
        GoogleSearchPageTask gp = new GoogleSearchPageTask();
        gp.setSearchBox("cucumber");
    }

    @Then("Sayfa başlığının cucumber olduğunu görür")
    public void sayfaBaşlığınınCucumberOlduğunuGörür() {

    }

    @And("sayfayı kapatır")
    public void sayfayıKapatır() {
    }

    @When("Kullanıcı arama kısmına selenium girdiğinde")
    public void kullanıcıAramaKısmınaSeleniumGirdiğinde() {
    }

    @Then("sayfa başlığının selenium olduğunu görür")
    public void sayfaBaşlığınınSeleniumOlduğunuGörür() {
    }
}
