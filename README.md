# Java Backend API 
This project is for building an API server and doing CRUD actions on the MySQL database
- Project deployed on Heroku:  https://java-springboot-1-demo.herokuapp.com/api/student/getAll
- API documentation(Open API) available on:  https://java-springboot-1-demo.herokuapp.com/swagger-ui/index.html
- API documentation(Postman) available on: https://documenter.getpostman.com/view/19797749/Uyxoj4Vd

## Main Dependencies
- Spring Boot
- Lombok
- JPA
- Maven

## Key takeaways from this project
- Building CRUD functions in the JAVA API and query from the MySql database
- Use Project Lombok to reduce the code lines 
- Use JPA and treat database tables as objects, making handling one-to-one, one-to-many relationships easier.
- JPA @Query annotation also allows programmers to use complex query strings
- Generate log file
- Use OpenAPI automatically generate API documentation
- Spring Aspect-oriented Programming, use @Before, @After, @AfterReturning, @Around
- Spring Boot Scheduler, use Cron expression. e.g. "0 0/1 * 1/1 * ?"
- Deploy the project on Heroku and switch to cloud base MySql database

## Improvements in the future
- Adding auth functions
- Organize endpoints structures

## Author
Simon Sun: sunmingyu.97@gmail.com
