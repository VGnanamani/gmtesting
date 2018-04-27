
@tag01
Feature: Canopy features
 
 
  @Scenario1
  Scenario: Create Report Template
  
    Given launch browser "chrome" and "https://dev-engine.kurtosys.org"
    When enter "at_002" and "TechGeek12!" and click Login button
    Then click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design
    And Click create button and On the pop-up, enter any "AutoTemplate test", choose Style Template as BaseTemplateDL and click on Save
    Then In the table, in the Name column, enter the unique report template name "AutoTemplate test" and Owner name "at_002" and Validate that the template
     And Logout from the application

     
     @Scenario2
     Scenario: Edit Report Template
     
     Given launch browser "chrome" and "https://dev-engine.kurtosys.org"
     Given enter "at_002" and "TechGeek12!" and click Login button
     When click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design
     Then In the table, in the Name column, enter the unique report template name "AutoTemplate test" and Owner name "at_002"
     Then  Click on the Edit icon of template and On the pop-up, edit the status to Ready to Assign and click on save.
      And Validate that the Status for your template in the table with "AutoTemplate test" and Owner name "at_002"  and with Ready to Assign
    Then  Logout from the application
     
     
     @Scenario3
     Scenario:Copy Report Template
     
     Given launch browser "chrome" and "https://dev-engine.kurtosys.org"
     Given enter "at_002" and "TechGeek12!" and click Login button
     When click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design
    Then In the table, in the Name column, enter the unique report template name "AutoTemplate test" and Owner name "at_002"
    Then Click copy icon of template and On the pop-up, enter unique Report Template Name "AutoTemplate_copied3" 
    Then In the table, in the Name column, enter the unique report template name "AutoTemplate_copied3" and Owner name "at_002" and Validate that the template
    Then  Logout from the application
     
     
     
     @Scenario4
     Scenario: Delete Report Template
     
     
     Given launch browser "chrome" and "https://dev-engine.kurtosys.org"
     Given enter "at_002" and "TechGeek12!" and click Login button
     When click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design
     Then In the table, in the Name column, enter the unique report template name "AutoTemplate test" and  "AutoTemplate_copied2" and Owner name "at_002"
     Then click Delete button and ok in conformation
     
     
     
     
     
     
     
     
     