Feature: OpenMRS Automation

Scenario: OpenMRS Login Page

    Given User initialize the chrome browser to launch
    When Redirect to https://qa-refapp.openmrs.org/openmrs/login.htm
    And enter Username "username"
    And enter Password "password" 
    And pick session location
    And click on login button
    Then verify User Is LoggedIn successfully in OpenMRS Dashboard 
    
   Scenario: OpenMRS Patient Registration
    Given User click the register a Patient 
    When User Enters in the Patient Name
    And  clicks the Next button1
    And User Selects the Patients Gender 
    And clicks the next button2
    And User enters the Date Of Birth
    And  clicks the Next button3
    And User enters the Address
    And  clicks the Next button4
    And User enters the Phone Number
    And  clicks the Next button5
    And  clicks the Next button6
    Then user Confirms The Patients Name, Gender, DOB, Address and Phone Number
    
    Scenario: OpenMRS Patient Page
    Given User verifies the patient details and selects the start visit
    Then clicks the confirm button
    And User selects the attachments and uploads the file 
    And User enter the captions for the file 
    Then clicks the upload file button
     And user clicks the Patients name near the home symbol 
     And User selects the End Visit  
     
     Scenario: OpenMRS Capture vitals
     Given User selects the stat visit button
     Then User clicks the Capital Vitals
     And User enters the Height,Weight and saves the form
     And  User verifies the vitals and select the save button
     And User selects the End Visit and clicks the Yes button
     Then User clicks the Patient Name on the Dashboard
     And  User selects the merge visit and selects the visits and selects the Merge Selected Visits button
     And User clicks the return button
     And User enters the reason for delete and veerifies the deleting process is completed
    