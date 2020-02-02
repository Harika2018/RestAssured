# RestAssured
Scenario Description:

Automating 4 API operations GET,POST,PUT,DELETE using RestAssured

Approach followed:

RestAssured with JTestNG

Technologies used:

Java,Eclipse, Maven , TestNG, RestAssured, Hamcrest, JSON,PostMan

Sample API used :

https://reqres.in

As reqres.in is one the best public API which is available online

GET Call automation:

Retrieving the User details containing the id as 1, 

Assertions validated: 
Get call is asserted with 
StatusCode
StatusLine
User email Id
Content-Type of header


POST Call:

Posting the user with name and Job information into 
https://reqres.in/api/users

Assertions validated:
StatusCode
StatusLine

PUT Call:

Posting/updating the user data with name and Job details into
https://reqres.in/api/users

Assertions Validated:
StatusCode
StatusLine

DELETE Call:

Deleting the existing user using https://reqres.in/api/users/2

Assertions validated:
StatusCode
StatusLine


Important Note:
I could not find any public API which allows POST/PUT/Delete requests.

Though reqres.in was allowing to make POST / PUT requests successfully,
same can not be retrieved or deleted. Existing data which
was already present in the website can be retrieved.
Deletion of any user was not allowed.So, it was validated with the negative test data.


