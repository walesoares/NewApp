package stepdefs;

import config.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import page.Homepage;


/**
 * Created by Wale on 23/01/2017.
 */

public class LoginStep extends DriverFactory {

    private Homepage homepage ;

    public LoginStep(SharedDriver driver) {

        homepage = new Homepage(driver) ;
    }


    @Given("^when a user is on the homepage$")
    public void when_a_user_is_on_the_homepage() throws Throwable {
       homepage.newsetup();
       homepage.toclickloginbtn();

    }

    @When("^when the user click the sign in button$")
    public void when_the_user_click_the_sign_in_button() throws Throwable {

    }

    @Then("^then the login page should be displayed$")

    public void then_the_login_page_should_be_displayed() throws Throwable {

    }

}
