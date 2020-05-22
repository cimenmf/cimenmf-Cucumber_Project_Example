Feature: 

	#Verify that given search terms result in tags in the search bar.
  @BRIT-4280
  Scenario Outline: Search Terms - Outline
    Given user is on the Calendar page
    When I enter a given search "<term>" into the search bar
    Then I should then see the given "<term>" as the value of a <tag> in the search bar

    Examples:
      | term          | tag           |
      | cucumber      | cucumber      |
      | cybertek      | cybertek      |
      | chrysanthemum | chrysanthemum |
      | clementine    | clementine    |
      | crinoline     | crinoline     |
		    