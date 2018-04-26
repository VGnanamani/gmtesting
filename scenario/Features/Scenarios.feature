
@tag01
Feature: Canopy features
 
 
  @Scenario01
  Scenario: Create Report Template
    Given launch browser "chrome" and "https://dev-engine.kurtosys.org"
    When enter "at_002" and "TechGeek12!" and click Login button
    Then click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design
    And Click create button and On the pop-up, enter any "AutoTemplate", choose "Style template" as "BaseTemplateDL" and click on Save
    Then In the table, in the Name column, enter the unique report template name that you had previously given above step
    And Validate that the template created by you is present in the table.
    And Logout from the application
