Feature: Login Feature

#Scenario: Valid Login 
#Given User is on Login Page
#When User enter login credentials
#Then User is on Home page


#Scenario: Valid Login 
#Given User is on Login Page
#When User enter "tomsmith" and "SuperSecretPassword!"
#Then User is on Home page


#Scenario Outline: Valid Login 
#Given User is on Login Page
#When User enter "<username>" and "<password>"
#Then User is on Home page


#Examples:
#       | username | password |
#       | testuser1 | welcome123 |
#       | testuser2 | welcome123 |
#       | tomsmith | SuperSecretPassword! |
       
       
Scenario: Valid Login 
Given User is on Login Page
When User enter login credentials
     | username | password |
     | tomsmith | SuperSecretPassword! |
Then User is on Home page