Feature: teampage displayed team number 

Background: homepage 
	Given the user is on the "page" 

Scenario: verify the home page title 
	Then verify the title is "title"
	

Scenario: Verify the number of displayed team number 
	When the user click the team botton 
	Then the user should see 32 teams  on the screen 
	
@temp	
Scenario:  	verify the team names in G group
	When the user click the group button
	Then group G icon should displaid 
	And the user click on group G icon
	Then verify all team names
	|Belgium|
	|Panama|
	|Tunisia|
	|England|
	
	
	
