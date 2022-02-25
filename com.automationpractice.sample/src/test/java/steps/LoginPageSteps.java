package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage;

    @Step
    public String getLoginPageTitle(){
        return loginPage.getTitle();
    }

    @Step
    public void enterEmail(String email){
        loginPage.enterEmailField(email);
    }

    @Step
    public void enterPassword(String password){
        loginPage.enterPasswordField(password);
    }

    @Step
    public void clickSignIn(){
        loginPage.clickSignIn();
    }

}
