package com.example.ui.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.RegistrationNegativePage;
import random.UserFactory;
import user.User;


import static com.codeborne.selenide.Selenide.open;

public class RegistrationNegativeSteps {

    private RegistrationNegativePage registrationNegativePage = new RegistrationNegativePage();
    private String randomEmail;
    private String generatedPassword;
    private User user;


    @Before
    public void setUP() {

        this.user = UserFactory.createRandom();
        this.randomEmail = user.getEmail();
        this.generatedPassword = user.getPassword();


    }

    @Given("the user is registered negative")
    public void the_user_is_registered_negative() {
        open("/");
        registrationNegativePage
                .clickLogin1Button()
                .clickRegisterButton()
                .setEmail(randomEmail)
                .setPassword(generatedPassword)
                .setConfirmPassword(generatedPassword)
                .clickCreateAccountButton()
                .clickLogoutButton();

    }
   @When ("the user clicks the Sign In button negative")
   public void the_user_clicks_the_Sign_In_button_negative() {
       registrationNegativePage.clickLogin1Button();
   }
    @And("the user clicks the No Account button negative")
    public void the_user_clicks_the_No_Account_button_negative() {
        registrationNegativePage.clickRegisterButton();
    }

    @And("the user enters a unique valid email negative")
    public void the_user_enters_a_unique_valid_email_negative() {
        registrationNegativePage.setEmail(randomEmail);
    }

    @And("the user enters a complex password negative")
    public void the_user_enters_a_complex_password_negative() {
        registrationNegativePage.setPassword(generatedPassword);
    }

    @And("the user confirms the password negative")
    public void the_user_confirms_the_password_negative() {
        registrationNegativePage.setConfirmPassword(generatedPassword);
    }

    @And("the user clicks the Create Account button negative")
    public void the_user_clicks_the_Create_Account_button_negative() {
        registrationNegativePage.clickCreateAccountButton();
    }
    @Then("the user sees the error message")
    public void the_user_sees_the_error_message() {
        registrationNegativePage.verifyTextLoginTitleIsVisible();
    }

}

