Feature: to verify adactin website

	Scenario Outline: to verify select hotel
		Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then user should verify "Select Hotel"
    
   Examples:
   		| UserName  | Password   | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | SubashS96 | Subash@S96 | Sydney   | Hotel Sunshine | Standard  | 1 - One         | 18/11/2021    | 19/11/2021     |               2 |                 1 |

  Scenario Outline: to verify select hotel by clicking mandatory fields
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults per Room>"
    Then user should verify "Select Hotel"

    Examples: 
      | UserName  | Password   | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | SubashS96 | Subash@S96 | Sydney   | 1 - One         | 18/11/2021    | 19/11/2021     |               2 |

      
	Scenario Outline: to verify date by changing back date for checkout date
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And enter the "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults per Room>"
    Then user should verify "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | UserName  | Password   | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | SubashS96 | Subash@S96 | Sydney   | 1 - One         | 18/11/2021    | 19/11/2020     |               2 |
	
	Scenario Outline: to verify select location by without clicking any fields
    Given to enter into the adactin url
    When to enter login "<UserName>" and "<Password>"
    And click the search button 
    Then user should verify "Please Select a Location"

    Examples: 
      | UserName  | Password   |
      | SubashS96 | Subash@S96 |
	