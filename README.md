# menstrual-tracker
A full-stack application created for University of St. Thomas course SEIS739.

# Authors
- Caitlin Klukas (https://github.com/cklukas16)
- Betsy Rowley (https://github.com/BetsyRowley)

# Technologies
1. Frontend
    * Angular 
    * [Bootstrap](https://ng-bootstrap.github.io/#/home)
    * TypeScript
2. Backend
    * Java
    * Spring Boot
    * Postgres (H2 local option)

# To Run Locally
1. Install/Update necessary packages
    * `npm install`
2. Configure the database (se developer notes below)
3. Start Back End Server (run Application.java)
4. Start Front End Server (angularclient)
    * `ng serve --open`

# Resources

- [Spring Boot Tutorial for Beginners](https://www.youtube.com/watch?v=UgX5lgv4uVM)
- [Building a Web Application with Spring Boot and Angular](https://www.baeldung.com/spring-boot-angular-web)
- [Hosting Springboot App on Render.com] (https://www.youtube.com/watch?v=p3AIecyvok4)


# Developer Notes
 - Practice with different server and hosting configurations. 
 - H2 (SQL) database:  initially used for local hosting and testing
 - Railway database:  remotely hosted Postgres instance
 - Render front end:  removely hosted AngularClient

# H2 CONFIG
 - Comment out POSTGRES lines from app.properties
 - Make H2 active in app.properties
 - Switch profile to dev in app.properties
 - Switch to H2 dependencies in pom.xml

# Postgres database with locally hosted frontend
 - Comment out H2 lines from app.properties
 - Make Postgres active in app.properties (???)
 - Switch profile to production in app.properties
 - Switch to Postgres dependencies in pom.xml
 - Comment out POSTGRES database setup for RENDER in application-production.properties
 - Switch to POSTGRES database setup for LOCAL HOST in application-production.properties