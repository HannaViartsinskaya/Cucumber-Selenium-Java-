Feature: Login

  Scenario: Successfull login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F\'"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    And "Catalog" tab should be present
    When User click on log out link
    Then Page Title should be "Your store. Login"
    And close browser

#  Scenario Outline: Login Data driven
#    Given User Launch Chrome browser
#    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F\'"
#    And User enters email as "<email>" and Password as "<password>"
#    And Click on Login
#    Then Page Title should be "Dashboard / nopCommerce administration"
#    When User click on log out link
#    Then Page Title should be "Your store. Login"
#    And close browser
#
#    Examples:
#    | email | password |
#    | admin@yourstore.com | admin |
#    | admin1@yourstore.com | admin123 |