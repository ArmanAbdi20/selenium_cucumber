package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utils.Driver;

public class AmazonStepDefinitions {
  static AmazonPage hp = new AmazonPage();
    @Given("Kullanıcı amazon ana sayfasındadır")
    public void kullanıcıHepsiburadaAnaSayfasındadır() {
        Driver.getDriver().get("https://www.amazon.com/");
    }

    @When("Arama kısmına {string} yazdığında")
    public void aramaKısmınaYazdığında(String airfry) {

        hp.getSearchBox().sendKeys(airfry+ Keys.ENTER);


    }

    @And("Sonuçlar içinden ilk çıkan ürünü sepete ekler")
    public void sonuçlarIçindenIlkÇıkanÜrünüSepeteEkler() {
        hp.sepeteekle();

    }

    @Then("Sepete gittiğinde Kargo bedava yazısını görür")
    public void sepeteGittiğindeKargoBedavaYazısınıGörür() {
        hp.sepeteTıkla();
        String expected ="Kargo bedava";
        Assert.assertEquals(expected,hp.getText());

    }
}
