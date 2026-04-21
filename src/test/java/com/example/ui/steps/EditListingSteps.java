package com.example.ui.steps;

import com.example.ui.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class EditListingSteps {

    private final TestContext context;
    public EditListingSteps(TestContext context) {
        this.context = context;
    }


    @Given("the user is logged in and on the main page edit")
    public void the_user_is_logged_in_and_on_the_main_page_edit() {
        open("/");
        context.editListingPage
                .clickPlaceAdButton()
                .setLoginEmail(context.user.getEmail())
                .setLoginPassword(context.user.getPassword())
                .clickLoginSubmitButton()
                .clickPlaceAdButton();
    }

    @When("the user fills out the new listing form and publishes it")
    public void the_user_fills_out_the_new_listing_form_and_publishes_it() {
        context.createListingPage
                .verifyNewListingTitleIsVisible()
                .setNameListing(context.listing.getListingName())
                .scrollToFooter()
                .setDescriptionListing(context.listing.getDescription())
                .setPriceListing(context.listing.getPrice())
                .clickButtonPostListing();
    }

    @And("the user Scroll Up")
    public void the_user_Scroll_Up() {
        context.editListingPage.scrollSearchField();
    }

    @And("the user enters the name of their listing into the Search field")
    public void the_user_enters_the_name_of_their_listing_into_the_Search_field() {
        context.editListingPage.enterSearchQuery(context.listing.getListingName());

    }

    @And("the user clicks the Apply button")
    public void the_user_clicks_the_Apply_button() {
        context.editListingPage.clickApplyButton();
    }

    @And("the user clicks on their found listing")
    public void the_user_clicks_on_their_found_listing() {
        context.editListingPage.clickListingButton();
    }

    @And("the user clicks the Edit Listing button")
    public void the_user_clicks_the_Edit_Listing_button() {
        context.editListingPage.clickEditListingButton();
    }

    @And("the user enters a new price into the Cost field")
    public void the_user_enters_a_new_price_into_the_Cost_field() {
        context.editListingPage.setUpdateName(context.listing.getPrice());
    }

    @And("the user clicks the Save Changes button")
    public void the_user_clicks_the_Save_Changes_button() {
        context.editListingPage.clickSaveСhangeButton();
    }

    @Then("the user should see a confirmation message First listing")
    public void the_user_should_see_a_confirmation_message_First_listing() {
        context.editListingPage.verifyFirstListingTitleIsVisible();
    }


}
