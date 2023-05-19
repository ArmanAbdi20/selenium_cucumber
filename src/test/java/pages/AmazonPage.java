package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage {



    @FindBy (id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy (xpath = "//button[@class='moria-ProductCard-fJNuEt iWnWwk shrdburqz11 sc-fzqARJ iIHcAM sc-fzqNqU kHwkx']")
    WebElement butonSepeteekle;

   @FindBy (id ="shoppingCart")
   WebElement sepet;

   @FindBy (xpath ="//div[text()='Kargo bedava']")
   WebElement text;

    public WebElement getSearchBox(){

      return   searchBox;

    }

    public void sepeteekle(){
        butonSepeteekle.click();
    }

    public void sepeteTıkla(){
        sepet.click();
    }

    public String getText(){
       return text.getText();
    }

}
