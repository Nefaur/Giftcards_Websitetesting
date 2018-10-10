Feature: Checkout page function of www.giftcards.com

Scenario: Testing the checkout page functionality for valid users

Given Existing Valid User opens browser
When Existing Valid User goes to "https://www.giftcards.com/" website
Then Existing Valid User hovers to sign_in_link
Then Existing Valid User clicks sign_in_link
Then Existing Valid User enters username and password in login text fields
|Username|Password|
|"moltenboy.robin@gmail.com"|"A1234567@"|
Then Existing Valid User clicks on submit button
Then Existing Valid User is taken to member page
Then Existing Valid User enters text in search field
|Search|
|"Google"|
|"Visa"|
|"Macy's|
Then Logged in User chooses the selection from search box field
Then Logged in User filters the selection by choosing Brand and subtype
Then Logged in User clicks on first selection from search result
Then Logged in User enters personal details for purchase
|First Name|Last Name|
|"Molten"|"Boy"|
Then Logged in User logouts
Then Logged out User closes browser