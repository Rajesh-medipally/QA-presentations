package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.HomePage;

public class HomePageSteps {
    private HomePage homePage;

    @Step
    public void launchHomePage(){
        homePage.open();
    }

    @Step
    public void clickSignInButton(){
        homePage.clickSignInButton();
    }

    @Step
    public String getHomePageTitle(){
        return homePage.getTitle();
    }
}
