Feature: Application Login


Scenario: Home Page default login for active user
Given User is on Netbanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home Page default login for blocked user
Given User is on Netbanking landing page
When User login into application with "john" and password "2345"
Then Home page is populated
And Cards displayed are "false"