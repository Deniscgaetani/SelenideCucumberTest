@Add
Feature: Adding todo on todomvc

  @important
  Scenario: Adding one todo
    Given I on todomvc website
    When  I add a todo
    Then  should show the todo i added