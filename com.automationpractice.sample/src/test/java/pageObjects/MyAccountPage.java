package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {


    public void clickSignOutButton(){
        clickOn($("//*[@class='logout']"));
    }


}
