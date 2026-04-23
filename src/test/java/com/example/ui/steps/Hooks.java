package com.example.ui.steps;

import io.cucumber.java.After;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Hooks {
    @After
    public void tearDown() {
        executeJavaScript("localStorage.clear();");
        clearBrowserCookies();

    }
}


