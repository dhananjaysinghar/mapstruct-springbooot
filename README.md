

## POST REQUEST
~~~
curl --location 'http://localhost:8080/api/book' \
--header 'Content-Type: application/json' \
--data-raw '{
    "servicePlanNumber": "test_servicePlanId",
    "agreementNumber": "test_agreementNumber",
    "products": [
        {
            "productNumber": "test_productCode",
            "productName": "test_productName"
        }
    ],
    "booking": {
        "bookingNumber": "test_bookingId",
        "bookingDate": "30/05/1990",
        "bookingStatus": "Confirmed",
        "parties": [
            {
                "partyCode": "test_partyCode",
                "partyName": "test_partyName",
                "emailAddress": "test@gmail.com"
            }
        ]
    }
}'
~~~

## GET REQUEST
~~~
curl --location 'http://localhost:8080/api/book/test_servicePlanId'
~~~