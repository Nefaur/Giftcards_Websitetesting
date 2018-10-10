@First @FunctionalTest
Feature: Login function test
Description: Test to check whether a user can follow the process to login and logout of Member Page.

@Smoke
Scenario: User enters valids username and password to enter authorized login homepage

Given User opens browser
When User goes to "https://www.giftcards.com/" website
Then User hovers to sign_in_link
Then User clicks sign_in_link
Then User enters "moltenboy.robin@gmail.com" as username
Then User enters "A1234567@" as password
Then User clicks on submit button
Then User is taken to member page
Then User logsout
Then User closes browser