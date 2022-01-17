@newtour 
Feature: Validate  NewTour Application 
Scenario: Test Newtour links 
	Given User Navigate to newtour page 
	And click on sign_on 
	Then validate sign in link is working
	And click on regitstration
	Then validate regitstration link is working
	And click on support and validate support
	And click on contact and validate contact
	And click on sign_on 
	When user login successfully 
	Then serach flight
	And click on sign out
	
	
	
	