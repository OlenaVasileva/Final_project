package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EditListingPage {

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
    //кнопка "редактировать объявление"
    private static final SelenideElement editListingButton = $(byXpath("//button[normalize-space()='Редактировать объявление']"));
    // Изменение поля стоимость
    private static final SelenideElement updateName = $(byXpath("//input[@name='price']"));
    //кнопка "сохранить изменения"
    private static final SelenideElement saveСhangeButton = $(byXpath(" //button[normalize-space()='Сохранить изменения']"));
    // текст "первое объявление"
    private static final SelenideElement textFirstListing = $(byXpath("//h2[contains(text(), 'Первое объявление')]"));


    //метод клика по кнопке Разместить объявление
    public EditListingPage clickPlaceAdButton() {
        placeAdButton.click();
        return this;
    }

    // метод заполнения поля ввода email
    public EditListingPage setLoginEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    // метод заполнения поля ввода пароля
    public EditListingPage setLoginPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    //метод клика по кнопке Войти
    public EditListingPage clickLoginSubmitButton() {
        loginSubmitButton.click();
        return this;
    }
    //скролл до поиска
    public EditListingPage scrollSearchField() {
        scrollSearchField.scrollIntoView(true);
        return this;
    }
    // метод заполнения поля поиск
    public EditListingPage enterSearchQuery(String searchQuery) {
        enterSearchField.setValue(searchQuery);
        return this;
    }
    // метод клика по кнопке "применить"
    public void clickApplyButton() {
        applyButton.click();
    }
    // метод клика по найденному объявлению
    public void clickListingButton() {
        listingButton.click();
    }

    // метод клика по кнопке редактировать объявления
    public void clickEditListingButton() {
        editListingButton.click();
    }
    // метод заполнения поля ввода Название
    public void setUpdateName(String name) {
        updateName.setValue(name);
    }
    // метод клика по кнопке сохранить изменения
    public void clickSaveСhangeButton() {
        saveСhangeButton.click();
    }
    //проверяет что текст "Первое объявление" есть на странице
    public void verifyFirstListingTitleIsVisible() {
        textFirstListing.shouldBe(visible);
    }

}
