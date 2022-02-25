Feature: login

  Scenario: Successful login with valid credentials
    Given User launches home page
    Then Page title should be "My Store"
    When User click on signIn
    Then Page title should be "Login - My Store"
    When User enters  email as "mrajesh7036@gmail.com" and password as "raju1234"
    And User click on signIn
    Then Page title should be "My account - My Store"
    When User click on signOut
    Then Page title should be "Login - My Store"
   # And close browser

