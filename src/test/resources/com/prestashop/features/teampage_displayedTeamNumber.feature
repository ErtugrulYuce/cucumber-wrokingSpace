Feature: teampage displayed team number 

Background: homepage 
	Given the user is on the "page" 
@temp 	
Scenario: verify the home page title 
	Then verify the title is "title"
	
@temp 
Scenario: Verify the number of displayed team number 
	When the user click the team botton 
	Then the user should see 32 teams  on the screen 
	
	
	
	
	
	
	
    