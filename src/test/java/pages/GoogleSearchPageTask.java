package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;

public class GoogleSearchPageTask {



    By searchBox = By.id("APjFqb");

    public void setSearchBox(String searchWord){

        Driver.getDriver().findElement(searchBox).sendKeys(searchWord + Keys.ENTER);

    }
}
