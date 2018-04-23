
@tagAddAcc
Feature: Creating Accounts
 
 
  @Login 
  Scenario: Login with valid users
    Given launch browser
    And Enter URL and view login page
    When enter "GM_Account_Admin" and "core@123"
    And click login button
    Then I validate the outcomes
    
  @Cloudaccount
 Scenario: Navigating to Authenticate tab
    Given In landing page click on the settings icon
    And select cloud accounts option
       And select Azure Rm option
    And select Add cloud account 
    Then Authentication option should appear
 
 
 @Cloudaccount
 Scenario: Validating fileds in Authentcate tab
 
  Given verify Account name field is availability
  And verify Description field is availability
  And verify Select options field is availability
  And verify Environment dropdown field is availability
  And verify Scope dropdown field is availability
  And verify TenantID field is availability
  And verify Account ID field is availability
  And verify Application Secret field is availability  
  And verify Application secret id field is availability
  
  @Cloudaccount
  
  Scenario: Enter values in all fields and click Generate
  
  Given enter Account name 
  And enter description
  And Select Custom option
  And select Staging in env dropdown
  And Select Tenant in scope
  And Enter Tenantid "21eb1d13-82f8-4ec9-9d6b-835cf471930d"
  And Enter applicationid "ac843e4d-92fb-4f7a-9584-906e1261a2e7"
  And Enter secretid "QXOiPOibHoQaM5Rg+AdTffCSac8Q9VlhKjV9CXrlpsw="
  Then click generate button
  Then Select SubscriptionID "Visual Studio Enterprise: BizSpark"
  Then Click Next button
  
  
  @Cloudaccount
  Scenario: Selecting options in Activation tab and click Next button
  
  Given Click Next button for activation
  
  
  @Cloudaccount
  
  Scenario: Selecting options in Configuration tab and click Next button
  
  Given Click Next button for configuration
  
  @Cloudaccount
  Scenario: Select roles and click finish button
  
  Given Select roles
  Then Click Finish button
  
  
  
  
  
  
  
  