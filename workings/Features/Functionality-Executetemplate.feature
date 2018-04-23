

Feature: Template Execution
  

@Login 
  Scenario: Login with valid users
    Given launch browser
    And Enter URL and view login page
    When enter "GM_Account_Admin" and "core@123"
    And click login button
    Then I validate the outcomes
 
  @Execute 
  Scenario: Navigate to Template tab
    Given click templates icon
    Then verify Market place tab
    

  @Execute 
  Scenario: search Provision_Linux_Instance_AzureRM
    Given Enter "Provision_Linux_Instance_AzureRM" in search text
    When click search icon
    
   @Execute  
   Scenario: Execute selected template
   Given mosehover on dotmenu
   Then Click Execute button
   
   @Execute
   Scenario: enter values for execution
   Given verify popup load
  