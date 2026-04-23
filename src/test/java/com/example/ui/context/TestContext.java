package com.example.ui.context;

import io.restassured.response.Response;
import pom.CreateListingPage;
import pom.DeleteListingPage;
import pom.EditListingPage;
import pom.LoginUserPage;
import random.ListingFactory;
import random.UserFactory;
import user.ApiUser;
import user.Listing;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContext {
    public final User user;
    public final Listing listing;
    public final ApiUser apiUser;
    public final DeleteListingPage deleteListingPage;
    public final CreateListingPage createListingPage;
    public final EditListingPage editListingPage;
    public final LoginUserPage loginUserPage;

    public TestContext() {
        this.user = UserFactory.createRandom();
        this.apiUser = new ApiUser();
        this.deleteListingPage = new DeleteListingPage();
        this.createListingPage = new CreateListingPage();
        this.editListingPage = new EditListingPage();
        this.loginUserPage = new LoginUserPage();
        this.listing = ListingFactory.createRandomListing();

        Response createResponse = apiUser.createNewUserStep(this.user);
        assertEquals(201, createResponse.statusCode(), "Не удалось создать пользователя через API");

    }


}

