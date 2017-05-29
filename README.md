We now have the initial models setup and we have swagger to helpl us communicate with our api endpoints.

By going to: `http://localhost:8080/swagger-ui.html`

and making a _POST_ to _http://localhost:8080/user_ with the following _JSON_ data: 

`{
  "address": {
    "city": "Birmingham",
    "country": "UK",
    "firstLine": "Cornerstone",
    "id": 0,
    "postCode": "B458BB",
    "secondLine": "Rednal"
  },
  "email": "hamid.afshar@rocket.com",
  "firstName": "hamid",
  "gender": "FEMALE",
  "id": 1,
  "lastName": "Afshar",
  "phoneNumber": "07813740478",
  "title": "MR"
}`

You will see magic happen.

Next step is to create a User table and an Address table with correct FK constraints and get hibernate on the go.