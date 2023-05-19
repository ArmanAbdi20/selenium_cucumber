package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstFeatureStepDefinitions {

    int int1, int2, toplam;
    @Given("Elimizde 3 sayısı mevcut")
    public void elimizde3SayısıMevcut() {
        int1 = 3;
        System.out.println("ilk sayı 3 olarak set edildi");
    }
    @Given("Elimizde 5 sayısı mevcut")
    public void elimizde5SayısıMevcut() {
        int2 = 5;
        System.out.println("ikinci sayı 5 olarak set edildi");
    }

    @When("Bu sayılar toplandığında")
    public void buSayılarToplandığında() {

        System.out.println("sayılar toplandı");
        toplam = int1+int2;

    }

    @Then("Toplamın olduğu görülmelidir")
    public void toplamınOlduğuGörülmelidir() {

        System.out.println("toplam değerleri karşılaştırıldı");

        Assert.assertEquals(8,toplam);
    }
}
