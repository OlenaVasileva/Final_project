package com.example.ui.steps;

import com.example.ui.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;


public class DeleteListingSteps {
    private final TestContext context;

    public DeleteListingSteps(TestContext context) {
        this.context = context;
    }

    @Given("the user is logged in and on the main page Delete")
    public void the_user_is_logged_in_and_on_the_main_page_Delete() {
        open("/");
        context.deleteListingPage
                .clickPlaceAdButton()
                .setLoginEmail(context.user.getEmail())
                .setLoginPassword(context.user.getPassword())
                .clickLoginSubmitButton()
                .clickPlaceAdButton();
    }

    @When("the user fills out the new listing form and publishes it Delete")
    public void the_user_fills_out_the_new_listing_form_and_publishes_it_Delete() {
        context.createListingPage
                .verifyNewListingTitleIsVisible()
                .setNameListing(context.listing.getListingName())
                .scrollToFooter()
                .setDescriptionListing(context.listing.getDescription())
                .setPriceListing(context.listing.getPrice())
                .clickButtonPostListing();
    }

    @And("the user Scroll Up Delete")
    public void the_user_Scroll_Up_Delete() {
        context.deleteListingPage.scrollSearchField();
    }

    @And("the user enters the name of their listing into the Search field Delete")
    public void the_user_enters_the_name_of_their_listing_into_the_Search_field_Delete() {
        context.deleteListingPage.enterSearchQuery(context.listing.getListingName());

    }

    @And("the user clicks the Apply button Delete")
    public void the_user_clicks_the_Apply_button_Delete() {
        context.deleteListingPage.clickApplyButton();
    }

    @And("the user clicks on their found listing Delete")
    public void the_user_clicks_on_their_found_listing_Delete() {
        context.deleteListingPage.clickListingButton();
    }

    @And("the user clicks the Delete Listing button")
    public void the_user_clicks_the_Delete_Listing_button() {
        context.deleteListingPage.clickDeleteListingButton();
    }

    @Then("the user should see a confirmation message First listing Delete")
    public void the_user_should_see_a_confirmation_message_First_listing_Delete() {
        context.deleteListingPage.verifyFirstListingTitleIsVisible();
    }


}
