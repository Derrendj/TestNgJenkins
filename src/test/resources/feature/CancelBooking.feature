Feature: to verify adactin website

  Scenario Outline: to verify adactin booking cancellation
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And select hotel and click continue
    And enter the "<First Name>","<Last Name>" and "<Billing address>"
    	| Credit Card Type | Credit Card No   | Expiry Month | Expiry Year | CVV |
      | American Express | 1245678364729382 | March        |        2023 | 276 |
      | VISA             | 7653728878829736 | April        |        2026 | 532 |
      | Master Card      | 6553782636826726 | September    |        2024 | 312 |
    And click "<Order No>" and cancel the booking
    Then user should verify "The booking has been cancelled."

    Examples: 
      | UserName  | Password   | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing address | Order No   |
      | SubashS96 | Subash@S96 | Sydney   | Hotel Sunshine | Standard  | 1 - One         | 19/11/2021    | 20/11/2021     |               2 |                 1 | Subash     | Karan     | Chennai         | 5QZI98A3UO |

      Scenario Outline: to verify adactin booking cancellation
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And click the booked itinerary and select the "<Order No>" and cancel the booking
    Then user should verify "The booking has been cancelled."