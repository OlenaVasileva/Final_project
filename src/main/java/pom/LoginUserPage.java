package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginUserPage {

    // Кнопка "Вход и регистрация"
    private static final SelenideElement loginButton = $(byXpath("//button[contains(text(), 'Вход и регистрация')]"));
    // Поле ввода email
    private static final SelenideElement emailInput = $(byXpath("//input[@name='email']"));
    // Поле ввода пароля
    private static final SelenideElement passwordInput = $(byXpath("//input[@name='password']"));
    // Кнопка "Войти"
    private static final SelenideElement loginSubmitButton = $(byXpath("//button[text()='Войти']"));
    // Кнопка "Разместить объявление"
    private static final SelenideElement placeAdButton = $(byXpath("//button[text()='Разместить объявление']"));
    // Найти текст заголовка
    private static final SelenideElement newAdTitle = $(byXpath("//h1[text()='Новое объявление']"));


    //метод клика по кнопке "Вход и регистрация"
    public void clickLoginButton() {
        loginButton.click();
    }

    // метод заполнения поля ввода email
    public void setLoginEmail(String email) {
        emailInput.setValue(email);
    }

    // метод заполнения поля ввода пароля
    public void setLoginPassword(String password) {
        passwordInput.setValue(password);
    }

    //метод клика по кнопке Войти
    public void clickLoginSubmitButton() {
        loginSubmitButton.click();
    }

    //метод клика по кнопке Разместить объявление
    public void clickPlaceAdButton() {
        placeAdButton.click();
    }

    //проверяет что текст есть на странице
    public boolean newAdTitleDisplayed() {
        return newAdTitle.isDisplayed();
    }

}

