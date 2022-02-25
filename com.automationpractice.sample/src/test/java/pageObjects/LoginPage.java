package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {


    public void enterEmailField(String email){
        typeInto($("#email"),email);
    }

    public void enterPasswordField(String password){
        typeInto($("#passwd"),password);
    }

    public void clickSignIn(){
        clickOn($("#SubmitLogin"));
    }

//    public String getTitle(){
//        return getDriver().getTitle();
//    }
}
