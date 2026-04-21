package com.example.ui.steps;

import com.example.ui.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class CreateListingSteps {
    private final TestContext context;

    public CreateListingSteps(TestContext context) {
        this.context = context;
    }


    @Given("the user is logged in and on the main page")
    public void the_user_is_logged_in_and_on_the_main_page() {
        open("/");
        context.createListingPage
                .clickPlaceAdButton()
                .setLoginEmail(context.user.getEmail())
                .setLoginPassword(context.user.getPassword())
                .clickLoginSubmitButton()
                .clickPlaceAdButton();
    }

    @When("the user sees the header New Listing")
    public void the_user_sees_the_header_New_Listing() {
        context.createListingPage.verifyNewListingTitleIsVisible();
    }

    @And("the user enters name listing")
    public void the_user_enters_name_listing() {
        context.createListingPage.setNameListing(context.listing.getListingName());
    }

    @And("the user Scroll Down")
    public void the_user_Scroll_Down() {
        context.createListingPage.scrollToFooter();
    }

    @And("the user enters description listing")
    public void the_user_enters_description_listing() {
        context.createListingPage.setDescriptionListing(context.listing.getDescription());
    }

    @And("the user enters price listing")
    public void the_user_enters_price_listing() {
        context.createListingPage.setPriceListing(context.listing.getPrice());
    }

    @And("the user clicks the post listing button")
    public void the_user_clicks_the_post_listing_button() {
        context.createListingPage.clickButtonPostListing();
    }

    @Then("the user sees the header First Listing")
    public void the_user_sees_the_header_First_Listing() {
        context.createListingPage.verifyFirstListingTitleIsVisible();
    }


}

