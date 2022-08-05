Feature: Automating the train booking system

  Scenario: Train ticket booking
    Given open the app
    When click on travel option
    Then Display the travel option
    And Click on train option

    Given To enter all the details to be asked
    And click search button
    Then Departure Journey page appears

    When user clicks Filter
    And Applies Filter
    Then List of Filtered Train would appear

    When user clicks on Desired Train
   Then checkout page appears

    When  user enters the contact details
    Then Payment page appears

    When user enters the personal details and id
    Then user sees the order page

