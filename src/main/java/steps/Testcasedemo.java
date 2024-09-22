package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testcasedemo {
    @Given("first user have to put the user id")
    public void first_user_have_to_put_the_user_id() {
        System.out.println("Farha");

    }
    @When("when user put the user id")
    public void when_user_put_the_user_id() {
        System.out.println("Hussain");

    }
    @Then("user need to put the correct password and after that user should click the login button")
    public void user_need_to_put_the_correct_password_and_after_that_user_should_click_the_login_button() {
        System.out.println("Arisha");
    }

}
