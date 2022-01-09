Feature: facebook sign in page texting 
@text 
Scenario: baslik, alt baslik ve labelleri check et 
	Given user on signin page 
	When user click create new account button 
	Then user able to see sign up title 
	And user able to see sign up subtitle 
	And user able to see firstname label 
	And user able to see lastname label 
	And user able to see mobile number or email label 
	And user able to see new password label 
	And user able to see birthday header 
	And user able to see gender header 
	And user able to see sign up button text 
	
@email 
Scenario: : Verify reenter email label 
	Given user on signin page 
	When user click create new account button 
	And user fill firstname field as a "Steve" 
	And user fill lastname field as a "Jobs" 
	And user fill email field as "sjobs@apple.com" 
	Then useer able to see reenter email label 
	
	
@firstNameErrorMessage 
Scenario: Verify first name error message 
	Given user on signin page 
	When user click create new account button 
	And user click firstname box 
	And user click lastname box 
	And user click firstname box 
	Then user able to see firstname error message 
	
@lastNameErrorMessage 
Scenario: Verify last name error message 
	Given user on signin page 
	When user click create new account button 
	And user fill firstname field as a "Steve" 
	And user click lastname box 
	And user click number or email box 
	And user click lastname box 
	Then user able to see lastname error mesage 
	
@numberOrEmailErrorMessage 
Scenario: Verify number or email error message 
	Given user on signin page 
	When user click create new account button 
	And user fill firstname field as a "Steve" 
	And user fill lastname field as a "Jobs" 
	And user click number or email box 
	And user click password box 
	And user click number or email box 
	Then user able to see number or email error message 


	
	
	
	