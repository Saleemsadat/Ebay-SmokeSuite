Feature: Ebay Signin from Ebay main page

Scenario: Ebay login Captcha
  Given user is on Ebay website
  When user clicks on login
  Then user should be able to see the text Please verify yourself under which there should be ebay Captcha
