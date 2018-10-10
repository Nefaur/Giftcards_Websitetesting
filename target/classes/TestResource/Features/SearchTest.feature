Feature: Search function of www.giftcards.com

Scenario: Testing the search functionality for valid users

Given Valid User opens browser
When Valid User goes to "https://www.giftcards.com/" website
Then Valid User hovers to sign_in_link
Then Valid User clicks sign_in_link
Then Valid User enters username and password in login text fields
|Username|Password|
|"moltenboy.robin@gmail.com"|"A1234567@"|
Then Valid User clicks on submit button
Then Valid User is taken to member page
Then Valid User enters text in search field
|Search|
|"Google"|
|"Visa"|
|"Macy's"|
Then Valid User chooses the selection from search box field
Then Valid User filters the selection by choosing Brand and subtype
Then Valid User clicks on first selection from search result
Then Valid User logouts
Then Valid User closes browser