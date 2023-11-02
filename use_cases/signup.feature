Feature: Sign up
Scenario: Add a user when the user is logged in
Given the usear is already logged in  
When add a user with username "manar" and email 'manar@gmail.com' and password 'manar' and userlevel 'ADMIN'
Then I will found the user with email 'manar@gmail.com'


Scenario: Add a user when the user is not logged in
Given the usear not logged in
When I try to add a user with username "manar" and email 'manar@gmail.com' and password 'manar' and userlevel 'ADMIN'
Then I can't found the user with email "manar@gmail.com" 