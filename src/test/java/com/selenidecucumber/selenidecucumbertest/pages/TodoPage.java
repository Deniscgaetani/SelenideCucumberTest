package com.selenidecucumber.selenidecucumbertest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// https://todomvc.com/examples/angular2/
public class TodoPage {

    public SelenideElement elementLabel = $("label");

    public SelenideElement newtodoInput = $(".new-todo");

    public void addTodo(String text) {
        newtodoInput.sendKeys(text);
        newtodoInput.pressEnter();
    }

    public void showTodoAdded() {
        elementLabel.shouldBe(visible);
    }

    public void clickTodoAdded() {
        elementLabel.click();
    }
}