# spring-pharma
A Spring Boot Application build with postgres With Docker Postgres

## Install Docker
### Install postgres instance
``` Command 
docker run -d -p 5432:5432 --name my-postgres -e POSTGRES_PASSWORD=postgres postgres
```

## URL end-points

### Post JSON data
http://localhost:9090/patient
Payload (example) - 
```json
{
    "firstName": "Adam",
    "lastName": "Sandler",
    "address": "123 Main St",
    "city": "Columbus",
    "state": "Ohio",
    "zipCode": "43201",
    "phoneNumber": "6140001234",
    "email": "adam.sandler@outlook.com"
}
```

### Post XML data
http://localhost:9090/datapoint
Payload (example) - 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<patient>
   <address>123 Main St</address>
   <city>Columbus</city>
   <email>adam.sandler@outlook.com</email>
   <firstName>Adam</firstName>
   <lastName>Sandler</lastName>
   <phoneNumber>6140001234</phoneNumber>
   <state>Ohio</state>
   <zipCode>43201</zipCode>
</patient>
```

### Get all patient records in JSON format
http://localhost:9090/patientRecords

### Get all patient records in XML format
http://localhost:9090/patientData

