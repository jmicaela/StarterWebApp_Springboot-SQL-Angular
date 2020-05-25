# API navigation

## Testing the springboot API

The app runs on port 5000. The api serves get requests for the list of employees and to search by first and last name.

```
/employees/
/employees/search?={substring}
```
Usage examples

```
http://localhost:5000/employees/search?substring=bolt

{"employeeList":[{"id":4,"firstName":"Jon","lastName":"Deadbolt","email":"jbolt@gmail.com"}]}
```

```
http://localhost:5000/employees/

{"employeeList":[{"id":1,"firstName":"Lokesh","lastName":"Gupta","email":"howtodoinjava@gmail.com"},{"id":2,"firstName":"Alex","lastName":"Kolenchiskey","email":"abc@gmail.com"},{"id":3,"firstName":"David","lastName":"Kameron","email":"titanic@gmail.com"},{"id":4,"firstName":"Jon","lastName":"Deadbolt","email":"jbolt@gmail.com"},{"id":5,"firstName":"Big","lastName":"Daddy","email":"bigDad@gmail.com"}]}
```

