package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;
import steps.LoginPageSteps;
import steps.MyAccountPageSteps;

public class LoginStepDefinations {

    @Managed
    WebDriver driver;
    @Steps
    HomePageSteps homePageSteps;
    @Steps
    LoginPageSteps loginPageSteps;
    @Steps
    MyAccountPageSteps myAccountPageSteps;


    @When("User launches home page")
    public void user_launches_home_page() {
        homePageSteps.launchHomePage();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {
        Assert.assertTrue(driver.getTitle().equals(string));
    }

    @When("User click on signIn")
    public void user_click_on_sign_in() {
        if(driver.getTitle().equals("Login - My Store")){
            loginPageSteps.clickSignIn();
        }else if(driver.getTitle().equals("My Store")){
            homePageSteps.clickSignInButton();
        }
    }

    @When("User enters  email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        loginPageSteps.enterEmail(string);
        loginPageSteps.enterPassword(string2);
    }

    @When("User click on signOut")
    public void user_click_on_sign_out() {
        myAccountPageSteps.clickSignOutButton();
    }
//
//    @Then("close browser")
//    public void close_browser() {
//        driver.
//    }

}
