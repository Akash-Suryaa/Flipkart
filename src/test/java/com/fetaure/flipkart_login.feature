Feature: Flipkart  Functionlity 

Scenario: Launch Flipkart application 
	Given User navigate to flipkart page 
	Then close browser
	
Scenario: Verify  details on Home page of flipkart application 
	Given User navigate to flipkart page 
	When user click on home button 
	Then check label , button, and links on home pages 
	Then close browser
	
	
Scenario: verify Flipkart Login Functionlity 
	Given User navigate to flipkart page 
	And  entered username and password 
	Then succefully logged in 
	Given click on Electronics and Check the all product. 
	Then close browser
 