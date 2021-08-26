package com.selenidecucumber.selenidecucumbertest.steps;

import com.codeborne.selenide.Selenide;
import com.selenidecucumber.selenidecucumbertest.pages.TodoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TodoMvcStep {

    public static final String URL = "https://todomvc.com/examples/angular2/";
    public static final String TEXT = "I'm adding one todo";
    public static final String EDITTEXT = "I'm editing this todo";
    public TodoPage page = new TodoPage();


    @Given("I on todomvc website")
    public void iOnTodomvcWebsite() {
        Selenide.open(URL);
    }

    @When("I add a todo")
    public void iAddATodo() {
        page.addTodo(TEXT);
    }

    @Then("should show the todo i added")
    public void shouldShowTheTodoIAdded() {
        page.showTodoAdded();
    }


    @When("I Edit a todo")
    public void iEditATodo() {
        page.clickTodoAdded();
        page.editTodo(EDITTEXT);
    }

    @Then("should show the todo i Edited")
    public void shouldShowTheTodoIEdited() {
        $(withText(EDITTEXT)).shouldBe(visible);
    }

    @When("I delete a todo")
    public void iDeleteATodo() {
        page.toggleInput();
        page.clearcompleted();
    }

    @Then("should not show the todo i deleted")
    public void shouldNotShowTheTodoIDeleted() {
       page.listExist();

    }
}
