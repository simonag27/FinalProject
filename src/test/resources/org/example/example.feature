Feature: An example

  Scenario: Valid email US
    Given I am on the main page
    When The email value of "user@test.com" is inputted
    And The submit button is clicked
    Then The newsletter pop-up appears

  Scenario: Valid email RO
    Given I am on the main page
    When The email value of "user@test.ro" is inputted
    And The submit button is clicked
    Then A pop-up tab will confirm the email

  Scenario: Negative over character limit
    Given I am on the main page
    When The email value of "simonaaaaaaaaaaaaaaAAaaaaaaaaa" is inputted
    And The submit button is clicked
    Then the email bar turns red

  Scenario: Valid Start The Enrollment button
    Given I am on the main page
    When I click on Start The Enrollment button
    Then The Personal Information page opens
    
  Scenario: Valid values on Personal Information page
    Given I am on the register page
    When The first name value of "Gridan" is inputted
    And The last name of "Simona" is inputted
    * The username of "simonag27" is inputted
    * The password of "abcd123" is inputted
    * The "abcd123" password confirmation is inputted
    * The Next button is clicked
    Then The Contact Information page opens

  Scenario: Invalid username section on Personal Information page
    Given I am on the register page
    When The first name value of "Gridan" is inputted
    And The last name of "Simona" is inputted
    * The username of " " is inputted
    * The password of "abcd123" is inputted
    * The "abcd123" password confirmation is inputted
    * The Next button is clicked
    Then I remain on Personal Information page

  Scenario: All fields from Register Page valid
    Given I am on the contact information page
    When The Next button is clicked
    Then The Contact Information page opens

  Scenario: Valid fields from Contact Information page
    Given I am on the contact information page
    When The "simonagridan12@gmail.com" email from Contact Information page is completed
    And The "0748635091" phone number from Contact Information page is completed
    * The "Romania" country from Contact Information page is completed
    * The "Sibiu" city form Contact Information page is completed
    * The "505200" post code from Contact Information page is completed
    * The next button from Contact Information page is clicked
    Then The Course Option page opens

  Scenario: Invalid phone number section from Contact Information page
    Given I am on the contact information page
    When The "simonagridan12@gmail.com" email from Contact Information page is completed
    And The " " phone number from Contact Information page is completed
    * The "Romania" country from Contact Information page is completed
    * The "Sibiu" city form Contact Information page is completed
    * The "505200" post code from Contact Information page is completed
    * The next button from Contact Information page is clicked
    Then I remain on Contact Information page

   Scenario: Invalid email section from Contact Information page
     Given I am on the contact information page
     When The "simonagridan12 " email from Contact Information page is completed
     And The "0742587865" phone number from Contact Information page is completed
     * The "Romania" country from Contact Information page is completed
     * The "Sibiu" city form Contact Information page is completed
     * The "505200" post code from Contact Information page is completed
     * The next button from Contact Information page is clicked
     Then I remain on Contact Information page

  Scenario: Valid Course Option button
    Given I am on the course options page
    When I select one course option
    And I click on Next button from Course Options page
    Then The Payment Information page opens

  Scenario: Negative Next button from Course Options page
    Given I am on the course options page
    When I click on Next button from Course Options page
    Then I remain on Course Options page

  Scenario: Valid Hybrid Read More button
    Given I am on the main page
    When I click on Read More button from Hybrid section
    Then the "Hybrid" page opens

  Scenario: Valid Fundamentals button
    Given I am on the main page
    When I click on the Read More button from Learn the Fundamentals section
    Then the "Fundamentals" page opens

  Scenario: Valid Selenium button
    Given I am on the main page
    When I click on the Read More button from Learn Selenium section
    Then The Selenium page opens

  Scenario: Valid Questions button
    Given I am on the main page
    When I click on the Questions button
    Then The Frequently Asked Questions appears

  Scenario: Valid Instructors button
    Given I am on the main page
    When I click on Instructors button
    Then Our Instructors section from main page appears

  Scenario: Valid Read More In Person button
    Given I am on the main page
    When I click on the Read More from In Person button
    Then In Person page opens































