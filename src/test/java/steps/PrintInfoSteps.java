package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintInfoSteps {

    @Given("the user print firstname")
    public void the_user_print_firstname() {
        System.out.println("Mohsen");
    }

    @When("the user print lastname")
    public void the_user_print_lastname() {
        System.out.println("Amir");
    }

    @Then("the user should see the fullName")
    public void the_user_should_see_the_full_name() {
        System.out.println("Mohsen Amir");
    }

    @Then("the user should see the full")
    public void the_user_should_see_the_full() {
        System.out.println("Full method");
    }


    @Then("the user print city")
    public void the_user_print_city() {
        System.out.println("Chicago");
    }

    @Then("the user print the city")
    public void the_user_print_the_city() {
        System.out.println("Houston");
    }


    @Then("the user print state")
    public void the_user_print_state() {
        System.out.println("IL");
    }

    @Then("the user print age")
    public void the_user_print_age() {
        System.out.println("30");
    }

    @Then("the user should see the school name")
    public void the_user_should_see_the_school_name() {
        System.out.println("Techtorial Academy");
    }

}
