Feature: To Check the functionality of "Delivery Filter"

  Scenario: Verify if the search of a course is successful
    Given an user navigate to "https://www.tafensw.edu.au/"
    And user clicks on the search icon
    And user search for a course using the serach box "Advanced Barista Skills"
    And hit enter to submit the search
    When navigated to course search page and click on delivery filter
    And set the filter "On Campus"
    Then it should be present in choosen course
