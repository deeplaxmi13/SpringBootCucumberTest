@ui
Feature: YouTube Test

  Scenario Outline: Verify YouTube channel name
    When I go to page <pageUrl>
    Then I verify YouTube channel name <expectedChannelName>
    Examples:
      | pageUrl                                    | expectedChannelName |
      | "https://www.youtube.com/c/techwithbeskat" | "Tech with Beskat"  |


