Feature: Complete Interventional Trial
  Scenario: Accept and validate complete interventional trial
    Given I click on trials menu option
    When I select identifier type NCI
    Then I type into identifier
    Then I click on search
    Then I click on NCI identifier
    Then I click on trial validation
    Then I click on accept
    Then I click on trial description
    Then I type complete interventional trial lorem ipsum into text area
    Then I click on briefTitle
    Then I type complete interventional trial into briefTitle
    Then I click save
    Then I click on Abstraction Validation and Design Details
    Then I create single group no masking randomized controlled trial
    Then I create outcome measures
    Then I enter healthy, gender, and age criteria
    Then I enter inclusion criteria
    Then I enter disease condition
    Then I enter NCI Specific Information
    Then I enter human subject safety
    Then I enter milestones
    Then I enter info on participating sites
    Then I enter info on accrual access
    Then I assert current trial status is active
    Then I assert processing status matches abstraction verified no response

