Feature: NewTours Application LogIn Functionality Testing

Scenario Outline: Validating LogIn FUncationality

Given Open FireFox Browser and navigate to newTours Application
When User enters valid "<UserName>" and "<Password>" and CLick on SignIn button
Then User should be able to successfully LogIn and Close the application

Examples:
 |    UserName     |   Password    |
 |    tutorial     |   tutorial    |
 |    admin        |   mercury     |
 |    tutorial     |   tutorial    | 