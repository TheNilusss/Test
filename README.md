//Erstelle Benutzer
curl -X "POST" "http://localhost:8081/createCustomer?firstName=Max&lastName=Mustermann

//Zeige Produkte
curl -X "GET" "http://localhost:8082/getProducts

//Erstelle einen Warenkorb
curl -X "POST" "http://localhost:8083/createCart?customerName=Max

//Füge Artikel dem Warenkorb hinzu
curl -X "POST" "http://localhost:8083/addToCart?customerName=Max&productName=Kaffee
