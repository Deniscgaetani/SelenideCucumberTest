package com.selenidecucumber.selenidecucumbertest.steps;

import com.codeborne.selenide.Selenide;
import com.selenidecucumber.selenidecucumbertest.pages.TodoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TodoMvcStep {

    public static final String URL = "https://todomvc.com/examples/angular2/";
    public static final String TEXT = "I'm adding one todo";
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
        page.clickTodoAdded();
    }


}
