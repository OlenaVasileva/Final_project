package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DeleteListingPage {
    // Кнопка "Разместить объявление"
    private static final SelenideElement placeAdButton = $(byXpath("//button[text()='Разместить объявление']"));
    // Поле ввода email
    private static final SelenideElement emailInput = $(byXpath("//input[@name='email']"));
    // Поле ввода пароля
    private static final SelenideElement passwordInput = $(byXpath("//input[@name='password']"));
    // Кнопка "Войти"
    private static final SelenideElement loginSubmitButton = $(byXpath("//button[text()='Войти']"));
    //Скролл до поля поиск
    private static final SelenideElement scrollSearchField = $(byXpath("//input[@name='name']"));
    //Ввод в  поле поиска
    private static final SelenideElement enterSearchField = $(byXpath("//input[@placeholder='Я хочу купить...']"));
    //кнопка "применить"
    private static final SelenideElement applyButton = $(byXpath("//button[normalize-space()='Применить']"));
    //клик по найденному объявление
    private static final SelenideElement listingButton = $(byXpath("//img[contains(@class, 'picture')]"));
    //кнопка "удалить объявление"
    private static final SelenideElement deleteListingButton = $(byXpath("//button[normalize-space()='Удалить']"));
    // текст "первое объявление"
    private static final SelenideElement textFirstListing = $(byXpath("//h2[contains(text(), 'Первое объявление')]"));


    //метод клика по кнопке Разместить объявление
    public DeleteListingPage clickPlaceAdButton() {
        placeAdButton.click();
        return this;
    }

    // метод заполнения поля ввода email
    public DeleteListingPage setLoginEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    // метод заполнения поля ввода пароля
    public DeleteListingPage setLoginPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    //метод клика по кнопке Войти
    public DeleteListingPage clickLoginSubmitButton() {
        loginSubmitButton.click();
        return this;
    }

    //скролл до поиска
    public DeleteListingPage scrollSearchField() {
        scrollSearchField.scrollIntoView(true);
        return this;
    }

    // метод заполнения поля поиск
    public DeleteListingPage enterSearchQuery(String searchQuery) {
        enterSearchField.setValue(searchQuery);
        return this;
    }

    // метод клика по кнопке "применить"
    public DeleteListingPage clickApplyButton() {
        applyButton.click();
        return this;
    }

    // метод клика по найденному объявлению
    public DeleteListingPage clickListingButton() {
        listingButton.click();
        return this;
    }

    // метод клика по кнопке удалить объявления
    public DeleteListingPage clickDeleteListingButton() {
        deleteListingButton.click();
        return this;
    }
    //проверяет что текст "Первое объявление" есть на странице
    public void verifyFirstListingTitleIsVisible() {
        textFirstListing.shouldBe(visible);
    }

}
