# TransactionManagement

Welcome to the TransactionManagement microservice , this is a repository for one of the 2 microservices that the account system consist of.
# Technologies Used :
  - Java 11
  - Spring boot 2.3.3
  - Spring data jpa
  - H2 in-memory databse
  - Lombok
  - Docker

# Description 

Transaction Management is one of the microservices that shapes the Account system , it is a spring boot application which run an in-memory h2 databse to operate the transaction management operations.

The service is using technologies as follows :
  - Spring boot and Rest webservices to popualte the endpoints
  - Spring Data jpa as a persistance layer
  - Lombok as a helper library
  
# How to Run
- Clone the project and checkout branch ````develop-transaction-management```` , you can just import the project in Inteliij or any preferable IDE , build the project using build tool in IDE or you can build it using maven by ````mvn clean install```` command, then run it using run option in the IDE or you can run it by ````mvn spring-boot:run````
- I have included a Dockerfile in order to build and run the project as a docker container instead of maven run, but according to some limitation in my working machine ,   I couldn't been able to build the image and upload it to docker hub, so following commands should build the image and run the container which exposing port 8082 <br>
 1- ````docker build -t transaction-management . ```` <br>
 2- ````docker run -it -p 8082:8082 transaction-management````
 - To track the in-memory database , access http://localhost:8082/h2-console and make sure that you are using ````org.h2.Driver```` as a driver class and ````jdbc:h2:mem:trnsmngdb```` as a JDBC URL  
