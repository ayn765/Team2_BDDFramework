Feature: navigate to Depth tabs on college page

  Background:
    Given user is on college page


    Scenario:
      When user hovers over dept tab
      And user selects finantial assistance from dept dropdown
      And user selects paying off dept on finantial assistance page
      Then user is navigated to paying off dept information page

      Scenario:
        When user hovers over home ownership tab
        And user selects home equity from home ownership dropdown
        And user clicks on mortgage basics tab
        Then user is navigated to mortgage options and tips page

        Scenario:
          When user hovers over auto tab
          And user selects buying car from auto dropdown
          And user clicks on auto loan tips
          Then user is navigated to auto loan tips page



