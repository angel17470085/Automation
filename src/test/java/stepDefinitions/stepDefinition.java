package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

public class stepDefinition {
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User is on NetBanking landing page");
    }

    @When("^User logins into the application with username and password$")
    public void user_logins_into_the_application_with_username_and_password() {
        System.out.println("User logs in with username and password");
        // Add code to perform login
    }
    @When("User logins into the application with {string} and password {string}")
    public void user_logins_into_the_application_with_and_password(String username, String password) {
        System.out.println("Logged in with the following credentials");
        System.out.println("username:" + username);
        System.out.println("password:"+ password);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
        // Add verification code for home page population
    }
    @And("Cards displayed are {string}")
    public void cards_displayed_are(String arg) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg);

    }

}
