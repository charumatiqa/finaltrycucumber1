
Feature: feature to test login functionality in para bank

Scenario Outline: Register in the bank website
Given user enters appUrl and click on register
When user enters "<firstname>", "<lastname>","<address>","<city>","<state>", "<zipcode>", and "<ssn>"
And user enters "<username>","<password>" and "<confirmPassword>"
Then clicks register

Examples:
|firstname|lastname|address|city|state|zipcode|ssn|username|password|confirmPassword|
|charufirst1|kallast1|whistlingaddress1|fortworthcity1|Txstate1|charu12345|1234|charuuser1|parapass1|parapass1|
#|demofirst2|demolast2|demoaddress2|democity2|demostate2|12346|1235|demouser2|demopass2|demopass2|



Scenario Outline: Check login with credentials
Given user enter "<appUrl>" completes registeration
When user enters "<username>" and "<password>"
And clicks login button
Then user navigates to home page

Examples:
|appUrl|username|password|
|https://parabank.parasoft.com/parabank/index.htm|demouser1|demopass1|
#|https://parabank.parasoft.com/parabank/index.htm|demouser2|demopass2|