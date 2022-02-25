package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {


    public void clickSignInButton(){
        $("//*[@class='login']").click();
    }

//    public String getPageTitle(){
//        return getDriver().getTitle();
//    }

}
