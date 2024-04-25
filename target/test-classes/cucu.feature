Feature: To validate the login functionality of flipkart application
Scenario: To validate with valid user name and invalid password
Given  To launch the chrome browser and maximise window
When  To launch the url of the flipkart application
And  To pass valid username in email feild
And  To pass invalid password in password field
And  To click the login button
And  To check whether navigate to home page or not
Then  To close the browser
