Feature: to verify adactin website

  Scenario Outline: to verify adactin booking confirmation
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And select hotel and click continue
    And enter the "<First Name>","<Last Name>" and "<Billing address>"
      | Credit Card Type | Credit Card No   | Expiry Month | Expiry Year | CVV |
      | American Express | 1245678364729382 | March        |        2023 | 276 |
      | VISA             | 7653728878829736 | April        |        2026 | 532 |
      | Master Card      | 6553782636826726 | September    |        2024 | 312 |
    Then user should verify "Booking Confirmation"

    Examples: 
      | UserName  | Password   | Location | Hotels | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing address | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV |
      | SubashS96 | Subash@S96 | Sydney   | Hotel Sunshine        | Standard  | 1 - One         | 19/11/2021    | 20/11/2021     |               2 |                 1 | Subash     | Karan     | Chennai         | 1234567890123456 | VISA             | March        |        2022 | 263 |

  Scenario Outline: to verify adactin boo
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And select hotel and click continue
    Then user should verify "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number"

    Examples: 
      | UserName  | Password   | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | SubashS96 | Subash@S96 | Sydney   | Hotel Sunshine | Standard  | 1 - One         | 19/11/2021    | 20/11/2021     |               2 |                 1 |
