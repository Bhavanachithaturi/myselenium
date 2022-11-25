Feature:working on newtours 
Scenario Outline:web application
Given user is in newtours 
When user needs to enter <uname> and <password>
Then user click on login button
And user navigated to home window

Examples:
| uname   | password |
| mercury | mercury |
|mercury123|mercury123|