@Regression
Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User clicks on All section

  @RetailHomePage
  Scenario: Verify Shop by Department sidebar
    Then the following options are present in the Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @EachDepartment
  Scenario Outline: Verify department sidebar options
    And User on '<department>'
    Then below options are present in department
      | '<optionOne>' | '<optionTwo>' |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automotive Parts & Accessories | Motorcycle & Powersports |
