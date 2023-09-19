package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination {

@Given("user enter url")
public void user_enter_url() {
   System.out.println("url");
}

@When("user enter valid username and password")
public void user_enter_valid_username_and_password() {
    System.out.println("username and password");
}

@When("user click on login button")
public void user_click_on_login_button() {
    System.out.println("login button");
}

@Then("validate user navigate to homepage")
public void validate_user_navigate_to_homepage() {
    System.out.println("homepage");
}

@When("user enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password() {
	System.out.println("inalid password");
}

@Then("validate error message")
public void validate_error_message() {
   System.out.println("error message");
}

@When("user enter invalid username and valid password")
public void user_enter_invalid_username_and_valid_password() {
System.out.println("invalid username");
}

@Then("validate user error message")
public void validate_user_error_message() {
  System.out.println("error message");
}

@When("user blank username and password")
public void user_blank_username_and_password() {
  System.out.println("blank");
}

@Then("validate the error message on blank")
public void validate_the_error_message_on_blank() {
   System.out.println("blank error message");
}

}
