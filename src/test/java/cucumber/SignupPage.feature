
@test1
Feature:  Sign in as a registered user

  Scenario: User has the right username and wrong password

    Given when the user is on the sign up page
    When  when user chooses to sign in
    And   user provides the following details

    | Email address | Password |
    | walesoares@gmail | lagos |

    And when the user clickk sign in
    Then User should get an error




