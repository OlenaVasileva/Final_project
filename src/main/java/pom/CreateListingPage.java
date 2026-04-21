package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CreateListingPage {
    // Кнопка "Разместить объявление"
    private static final SelenideElement placeAdButton = $(byXpath("//button[text()='Разместить объявление']"));
    // Поле ввода email
    private static final SelenideElement emailInput = $(byXpath("//input[@name='email']"));
    // Поле ввода пароля
    private static final SelenideElement passwordInput = $(byXpath("//input[@name='password']"));
    // Кнопка "Войти"
    private static final SelenideElement loginSubmitButton = $(byXpath("//button[text()='Войти']"));
    // Проверить заголовок "Новое объявление"
    private static final SelenideElement newListing = $(byXpath("//h1[contains(@class, 'createListing_title__IFtFs')]"));
    // Поле ввода названия объявления
    private static final SelenideElement nameListing = $(byXpath("//input[contains(@class, 'inputStandart')]"));
    // Поле ввода текста объявления
    private static final SelenideElement descriptionListing = $(byXpath("//textarea[@placeholder='Описание товара']"));
    // Поле ввода стоимости
    private static final SelenideElement priceListing = $(byXpath("//input[@placeholder='Стоимость']"));
    // Кнопка опубликовать
    private static final SelenideElement buttonPostListing = $(byXpath("//button[text()='Опубликовать']"));
    // Проверить отображение "Первое объявление"
    private static final SelenideElement textFirstListing = $(byXpath("//h2[contains(text(), 'Первое объявление')]"));
    // Скролл до футера
    private static final SelenideElement scrollToFooter = $(byXpath("//a[text()='Документация']"));


    //метод клика по кнопке Разместить объявление
    public CreateListingPage clickPlaceAdButton() {
        placeAdButton.click();
        return this;
    }

    // метод заполнения поля ввода email
    public CreateListingPage setLoginEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    // метод заполнения поля ввода пароля
    public CreateListingPage setLoginPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    //метод клика по кнопке Войти
    public CreateListingPage clickLoginSubmitButton() {
        loginSubmitButton.click();
        return this;
    }


    //проверяет что текст есть на странице
    public CreateListingPage verifyNewListingTitleIsVisible() {
        newListing.shouldBe(visible);
        return this;
    }

    // метод заполнения поля ввода Название
    public CreateListingPage setNameListing(String name) {
        nameListing.setValue(name);
        return this;
    }

    // метод заполнения поля ввода Описание
    public CreateListingPage setDescriptionListing(String description) {
        descriptionListing.setValue(description);
        return this;
    }

    // метод заполнения поля Стоимость
    public CreateListingPage setPriceListing(String price) {
        priceListing.setValue(price);
        return this;
    }

    //метод клика по кнопке Опубликовать
    public CreateListingPage clickButtonPostListing() {
        buttonPostListing.click();
        return this;
    }

    //проверяет что текст "Первое объявление" есть на странице
    public CreateListingPage verifyFirstListingTitleIsVisible() {
        textFirstListing.shouldBe(visible);
        return this;
    }

    //скролл до  футера
    public CreateListingPage scrollToFooter() {
        scrollToFooter.scrollIntoView(true);
        return this;
    }
}