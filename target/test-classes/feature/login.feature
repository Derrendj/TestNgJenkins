Feature: to verify adactin website

  Scenario Outline: to verify adactin login details
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And to click the login button
    And enter the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And select hotel and click continue
    And enter the "<First Name>","<Last Name>","<Billing address>","<Credit Card No>","<Credit Card Type>","<Expiry Month>","<Expiry Year>" and "<CVV>".
    Then user should get the order id

    Examples: 
      | UserName  | Password | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing address | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV |
      | SubashS96 | 8MI86Z   | Sydney   | Hotel Sunshine | Standard  | 1 - One         | 16/11/2021    | 17/11/2021     |               2 |                 1 | Subash     | Karan     | Chennai         | 1234567890123456 | VISA             | March        |        2022 | 263 |
