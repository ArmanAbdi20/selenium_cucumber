package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleHomePage;
import utils.Driver;

public class BackgroundStepDefinitions {
    @Given("Kullanıcı https:\\/\\/www.google.com\\/ sayfasındadır")
    public void kullanıcıHttpsWwwGoogleComSayfasındadır() {

        Driver.getDriver().get("https://www.google.com");
    }

    @When("Kullanıcı arama kısmına amazon yazar")
    public void kullanıcıAramaKısmınaAmazonYazar() {
        GoogleHomePage hp =new GoogleHomePage();
        hp.searchFor("amazon");
    }

    @And("Kullanıcı aramayı gerçekleştirdiğinde")
    public void kullanıcıAramayıGerçekleştirdiğinde() {

        GoogleHomePage hp = new GoogleHomePage();
        hp.clickSearchButton();
    }

    @Then("Kullanıcı title de amazon u görmelidir")
    public void kullanıcıTitleDeamazonUGörmelidir() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("amazon"));
    }

    @Then("Kullanıcı title de linkedin ı görür")
    public void kullanıcıTitleDeLinkedinIGörür() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("linkedin"));

    }

    @When("Kullanıcı arama kısmına linkedin yazar")
    public void kullanıcıAramaKısmınaLinkedinYazar() {
        GoogleHomePage hp =new GoogleHomePage();
        hp.searchFor("linkedin");
    }
}
