@Important
Feature: Adding todo on todomvc

  @Add
  Scenario: Adding one todo
    Given I on todomvc website
    When  I add a todo
    Then  should show the todo i added
  @Edit
  Scenario: Edit one todo
    Given I on todomvc website
    When  I Edit a todo
    Then  should show the todo i Edited
  @Delete
  Scenario: Delete one todo
    Given I on todomvc website
    When  I delete a todo
    Then  should not show the todo i deleted