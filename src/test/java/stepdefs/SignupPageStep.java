package stepdefs;

import config.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


/**
 * Created by Wale on 24/01/2017.
 */


public class SignupPageStep extends DriverFactory {

    private LoginStep loginStep ;

    public SignupPageStep (SharedDriver driver) {
        loginStep = new LoginStep(driver) ;
    }

    @Given("^when the user is on the sign up page$")
    public void when_the_user_is_on_the_sign_up_page() throws Throwable {
      loginStep.then_the_login_page_should_be_displayed();

    }


    @When("^when user chooses to sign in$")
    public void when_user_chooses_to_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And ("^user provides the following details$")
    public void user_provides_the_following_details(DataTable userdetails) throws Throwable {
       // HomePageLanding HLP = new HomePageLanding(driver) ;
       // List <List<String>  > data = userdetails.raw();
       // HLP.Enterusername(data.get(1).get(0) );
        //HLP.Enterwrongpw (data.get(1). get(1)) ;

    }

    @And("^when the user clickk sign in$")
    public void when_the_user_clickk_sign_in() throws Throwable {

       // HomePageLanding HLP = new HomePageLanding(driver);
       // HLP.ClickLogin();
    }

    @Then("^User should get an error$")
    public void user_should_get_an_error() throws Throwable {

        //HomePageLanding HLP = new HomePageLanding(driver);
        //HLP.GotoErrorMsg();

    }
}
