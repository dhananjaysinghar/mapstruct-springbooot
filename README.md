
## GET REQUEST
~~~
curl --location 'http://localhost:8080/api/book/test_servicePlanId'
~~~


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




#### DTO
~~~

{
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
}
~~~


###  ENTITY
~~~
{
    "servicePlanId": "test_servicePlanId",
    "agreementNumber": "test_agreementNumber",
    "productEntities": [
        {
            "productId": "test_productCode",
            "productName": "test_productName"
        }
    ],
    "bookingEntity": {
        "bookingId": "test_bookingId",
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
}
~~~

### REF
~~~
https://mapstruct.org/

https://www.baeldung.com/java-mapstruct-mapping-collections#:~:text=In%20general%2C%20mapping%20collections%20with,generate%20the%20mapping%20code%20automatically.

https://www.youtube.com/watch?v=EVCrLp-k494&t=1996s

~~~
