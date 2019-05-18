@sprint1
Feature: validate the login Functionality

  @US0002
  Scenario Outline: validate the negative login functionality
    Given Navigate to utest url
    When Click on sign in link
    And Enter email "<EMAIL>"
    And Click on sign in button
    Then validate the error message "<EXPECTED>"

    Examples: 
      | EMAIL             | EXPECTED                      |
      | school@gmail.com  | Invalid username or password. |
      
