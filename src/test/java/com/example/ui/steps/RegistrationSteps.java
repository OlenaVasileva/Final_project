package com.example.ui.steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.RegistrationPage;
import random.UserFactory;
import user.User;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationSteps {

    private RegistrationPage registrationPage = new RegistrationPage();
    ;
    private String randomEmail;
    private String generatedPassword;
    private User user;


    @Before
    public void setUP() {

        this.user = UserFactory.createRandom();
        this.randomEmail = user.getEmail();
        this.generatedPassword = user.getPassword();

    }


    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        open("/");
    }

    @When("the user clicks the Sign In button")
    public void the_user_clicks_the_Sign_In_button() {
        registrationPage.clickLogin1Button();
    }

    @And("the user clicks the No Account button")
    public void the_user_clicks_the_No_Account_button() {
        registrationPage.clickRegisterButton();
    }

    @And("the user enters a unique valid email")
    public void the_user_enters_a_unique_valid_email() {
        registrationPage.setEmail(randomEmail);
    }

    @And("the user enters a complex password")
    public void the_user_enters_a_complex_passwordd() {
        registrationPage.setPassword(generatedPassword);
    }

    @And("the user confirms the password")
    public void the_user_confirms_the_password() {
        registrationPage.setConfirmPassword(generatedPassword);
    }

    @And("the user clicks the Create Account button")
    public void the_user_clicks_the_Create_Account_button() {
        registrationPage.clickCreateAccountButton();
    }

    @And("the user clicks on the profile photo")
    public void the_user_clicks_on_the_profile_photo() {
        registrationPage.clickPhotoProfileButton();
    }

    @Then("the user is redirected to the My Profile page")
    public void the_user_is_redirected_to_the_My_Profile_page() {
        boolean isVisible = registrationPage.isMyProfileHeaderDisplayed();
        assertTrue(isVisible, "Заголовок 'Мой профиль' не отображается на странице. Переход не выполнен.");
    }


}