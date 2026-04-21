package pom;



import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {

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

    // Кнопка для фото профиля
    private static final SelenideElement photoProfileButton = $(".circleSmall");

    // Заголовок "Мой профиль"
    private static final SelenideElement myProfileHeader = $("h1.h1.zeroMargin");
    // кнопка "Выйти"
    public static final SelenideElement logoutButton = $(byXpath("//button[contains(text(), 'Выйти')]"));


    //метод клика по кнопке "Вход и регистрация"
    public RegistrationPage clickLogin1Button() {
        loginButton.click();
         return this;
    }

    //метод клика по кнопке "Нет аккаунта"
    public RegistrationPage clickRegisterButton() {
        registerButton.click();
        return this;
    }
    // метод заполнения поля ввода email
    public RegistrationPage setEmail(String email) {
        emailField.setValue(email);
        return this;
    }

    // метод заполнения поля ввода пароля
    public RegistrationPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }
    // метод заполнения поля подтверждения пароля
    public RegistrationPage setConfirmPassword(String confirmPassword) {
        confirmPasswordField.setValue(confirmPassword);
        return this;
    }

    // метод клика по кнопке авторизации
    public RegistrationPage clickCreateAccountButton() {
        createAccountButton.click();
        return this;
    }

    //метод клика по кнопке фото профиля
    public RegistrationPage clickPhotoProfileButton() {
        photoProfileButton.click();
        return this;
    }

    //проверяет что текст есть на странице
    public boolean isMyProfileHeaderDisplayed() {
        return myProfileHeader.isDisplayed();
    }

    //Кнопка Выйти
    public RegistrationPage clickLogoutButton() {
        logoutButton.click();
        return this;
    }

}