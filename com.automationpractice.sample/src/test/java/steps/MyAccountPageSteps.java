package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.MyAccountPage;

public class MyAccountPageSteps {

    private MyAccountPage myAccountPage;

    @Step
    public String getMyAccountPageTitle(){
        return myAccountPage.getTitle();
    }

    @Step
    public void clickSignOutButton(){
        myAccountPage.clickSignOutButton();
    }
}
