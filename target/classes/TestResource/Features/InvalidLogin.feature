Feature: Invalid login function of www.giftcards.com

@Second
Scenario Outline: Testing the login functionality for invalid users

Given Invalid User opens browser
When Invalid User goes to "https://www.giftcards.com/" website
Then Invalid User hovers to sign_in_link
Then Invalid User clicks sign_in_link
Then Invalid User enters <username> as username
Then Invalid User enters <password> as password
Then Invalid User clicks on submit button
Then Invalid User gets failed login message
Then Invalid User closes browser

Examples:
|username|password|
|"moltenboy.robin@gmail.com"|"123456789"|
|"moltenboy@gmail.com"|"A1234567@"|
|"moltenboy@gmail.com"|""|
|""|"A1234567@"|