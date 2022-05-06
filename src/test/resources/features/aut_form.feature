#Actor: Christian Tapias Escudero - t.christian@tcs.com

Feature: as a user want to the form of the page

  Background: open browser
    Given the user enter to the website

  @1
  Scenario Outline: the user complete the form
    When the user enter the information <country> <city> <password>
    Then the user see the message
    Examples:
      | country                        | city     | password    |
      | British Indian Ocean Territory | mosku    | 123password |
      | Argentina                      | Medellin | 456password |
      | Antarctica                     | Pinguino | 786password |