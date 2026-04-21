package com.example.ui.steps;

import com.example.ui.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginUserSteps {

    private final TestContext context;
    public LoginUserSteps(TestContext context) {
        this.context = context;
    }


    @Given ("the user is on the main page login")
    public void the_user_is_on_the_main_page_login() {
        open("/");
    }
    @When ("the user clicks the Sign In button login")
    public void the_user_clicks_the_Sign_In_button_login() {
        context.loginUserPage.clickLoginButton();
    }
    @And("the user enters unique valid email login")
    public void the_user_enters_unique_valid_email_login() {
        context.loginUserPage.setLoginEmail(context.user.getEmail());
    }
    @And ("the user enters complex password login")
    public void  the_user_enters_complex_password_login() {
        context.loginUserPage. setLoginPassword(context.user.getPassword());
    }
    @And ("the user clicks the Log in button login")
    public void the_user_clicks_the_Log_in_button_login() {
        context.loginUserPage.clickLoginSubmitButton();
    }
   @And ("the user clicks the Post an Ad Button login")
   public void the_user_clicks_the_Post_an_Ad_Button_login() {
       context.loginUserPage.clickPlaceAdButton();
    }
    @Then ("the New Ad page should be displayed login")
    public void the_New_Ad_page_should_be_displayed_login() {
        boolean isVisible = context.loginUserPage.newAdTitleDisplayed();
        assertTrue(isVisible, "Заголовок 'Мой профиль' не отображается на странице. Переход не выполнен.");
    }


    }
