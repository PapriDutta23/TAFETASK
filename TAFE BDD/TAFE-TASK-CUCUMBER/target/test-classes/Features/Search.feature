Feature: To Check the functionality of SEARCH button

  Scenario: Verify if the search of a course is successful
    Given an user navigate to "https://www.tafensw.edu.au/"
    And user clicks on the search icon
    And user search for a course using the serach box "Advanced Barista Skills"
    And hit enter to submit the search
    Then the course user searched for should appear "Advanced Barista Skills"  in the result
