Feature: Verify the Adacitin Order booking functionality 
Scenario Outline: Verify the hotel booking and order id creation
    When user enter "<username>","<pass>"
    And Users eters"<Location>","<Hotels>","<Roomtype>","<Number of Rooms>","<checkin>","<checkout>","<AdultperRoom>","<ChildperRoom>"
    And Users selects the required Hotel
    And User Enters "<Firstname>","<Lastname>","<Address>","<Creditcard>","<CardType>","<Expmonth>","<Expyear>","<Cvv>"
    Then Oder is confirmed and Order id is generated

    Examples:
					|namenme|pass|Location|Hotels|RoomType|NofoRooms|Checkin|Checkout|AdultperRoom|ChildperRoom|Firstname|Lastname|Address|creditcard|CardType|Expmonth|Expyear|Cvv|
					|RavichandhiraneD|Ravi@themail|Sydney|Hotel Creek|Standard|1 - One|03/03/2022|04/03/2022|1 - One|1 - One|Kalai|vani|no:70annanagarwest|8959266895788582|VISA|September|2022|895|
					|RavichandhiraneD|Ravi@themail|Brisbane|Hotel Sunshine|Standard|2 - Two|03/03/2022|04/03/2022|1 - One|1 - One|Saatvik|V|no:78poonthamalli|89592668957848579|VISA|September|2022|923|
					|RavichandhiraneD|Ravi@themail|Melbourne|Hotel Hervey|Standard|2 - Two|03/03/2022|04/03/2022|1 - One|1 - One|Kalai|V|no:70annanagarwest|8959266787484512|VISA|September|2022|788|
					|RavichandhiraneD|Ravi@themail|London|Hotel Creek|Standard|1 - One|03/03/2022|04/03/2022|1 - One|1 - One|Vinodh|V|no:67iyappanthangal|8959266895784512|VISA|September|2022|835|
					|RavichandhiraneD|Ravi@themail|Paris|Hotel Cornice|Standard|1 - One|03/03/2022|04/03/2022|1 - One|1 - One|Manjula|R|no:70kknagar|8959266895858512|VISA|September|2022|433|
				