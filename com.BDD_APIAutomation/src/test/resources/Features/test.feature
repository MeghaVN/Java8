Feature: List  the org  repo 

@listorg
Scenario: list repositories of an org 
This scenario will list all the repositories of an org with GET request

Given Header "Authorization" has value "Bearer token"
When "Get" request is executed 
Then Verify the status code as 200



Scenario: list private repositories of an org 
This scenario will list all the private  repositories of an org with GET request

Given Header "Authorization" has value "Bearer token"
And Query parameter "type" has value "private"
When "Get" request is executed 
Then Verify the status code as 400


Scenario: list private repositories of an org with limit 
This scenario will list all the private  repositories of an org with GET request and per page limit

Given Header "Authorization" has value "Bearer token"
And Query parameter "type" has value "private"
And Query parameter "per_page" has value "private"
And Query parameter "page" has value 2
When "Get" request is executed 
Then Verify the status code as 200




