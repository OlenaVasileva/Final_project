
package pom;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationNegativePage {

    // Кнопка "Вход и регистрация"
    private static final SelenideElement loginButton = $(byXpath("//button[contains(text(), 'Вход и регистрация')]"));

    // Кнопка "Нет аккаунта"
    private static final SelenideElement registerButton = $(byXpath("//button[text()='Нет аккаунта']"));

    // Поле ввода email
    private static final SelenideElement emailField = $(byName("email"));

    // Поле ввода пароля
    private static final SelenideElement passwordField = $(byName("password"));

    // Поле "Повторите пароль"
    private static final SelenideElement confirmPasswordField = $(byName("submitPassword"));

    // Кнопка "Создать аккаунт"
    private static final SelenideElement createAccountButton = $(byXpath("//button[text()='Создать аккаунт']"));
    // кнопка "Выйти"
    private static final SelenideElement logoutButton = $(byXpath("//button[contains(text(), 'Выйти')]"));
    //текст логин и пароль неверну
    private static final SelenideElement textLogin = $(byXpath("//span[text()='Ошибка']"));


    //метод клика по кнопке "Вход и регистрация"
    public RegistrationNegativePage clickLogin1Button() {
        loginButton.click();
        return this;
    }

    //метод клика по кнопке "Нет аккаунта"
    public RegistrationNegativePage clickRegisterButton() {
        registerButton.click();
        return this;
    }

    // метод заполнения поля ввода email
    public RegistrationNegativePage setEmail(String email) {
        emailField.setValue(email);
        return this;
    }

    // метод заполнения поля ввода пароля
    public RegistrationNegativePage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    // метод заполнения поля подтверждения пароля
    public RegistrationNegativePage setConfirmPassword(String confirmPassword) {
        confirmPasswordField.setValue(confirmPassword);
        return this;
    }

    // метод клика по кнопке авторизации
    public RegistrationNegativePage clickCreateAccountButton() {
        createAccountButton.click();
        return this;
    }

    // метод клика по кнопке выйти
    public RegistrationNegativePage clickLogoutButton() {
        logoutButton.click();
        return this;
    }

    //проверяет что текст "Логин и пароль неверны" есть на странице
    public void verifyTextLoginTitleIsVisible() {
        textLogin.shouldBe(visible);
    }
}

