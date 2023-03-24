# Service for private bank account.

## Spring Boot Service for private bank account.

The Spring Boot REST service for private bank account.

## Requirements:

- Use any *object-oriented language*.
- Use last Spring boot version.
- Use last MySQL database version.
- Create REST API service.
- Create docker compose for run service.
- provide code and clear instructions how to run it.

**Note**: please put your code in public repository.

**Note**: Please send link to this repo when you are done.

You will need the following technologies available to try it out:

* Git
* Spring Boot 3.*
* Mysql 8.*
* Gradle 7+
* JDK 17
* Docker
* IDE of your choice

## TO-DO list (ASAP):

- Add functionality for login.
- Add functionality for display ui welcome message.
- Add functionality for display balance, summary, movements etc.
- Add functionality for logout.
- Add functionality for register a new user.
- Add functionality for transfer money.
- Add functionality for request loan. 
- Add functionality for delete account.
- Add functionality for sort positions.
- Add functionality for logout timing.
- Add security functionality.
- Add JWT token security functionality.
- Add thymeleaf ui page. 
- 

### Schema databases

![]()

### How it works.

![](https://i.postimg.cc/cJSd5Tr5/Bankist-flowchart.png)

### Actuator

* http://localhost:8080/actuator
* http://localhost:8080/actuator/health
* http://localhost:8080/actuator/info

### http://localhost:8080/actuator/health

```{"status":"UP"}```

### Ho w to run.

``` gradle build```