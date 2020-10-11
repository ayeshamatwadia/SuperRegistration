# Super Registration App
An Angularjs spring-boot application that deals with a user registration and viewing of users all backed by a dockerized postgres database ie this is a CRUD exercise using angular and spring boot

## starting the app

step1:

bring up the docker container using the yaml file provide in the route directory of the project
> docker-compose up -d

make sure your docker container is up
>docker container ls

you are looking for a container named super_registration_db

step2:

start your backend application

>cd backend
>
>mvn clean install
>
>mvn spring-boot:run

step3:

start up the angular front end

in another terminal run

>cd frontend
>
>npm install
>
>ng serve

## Other commands

To bring down the docker container run from the project route

>docker-compose down

To run the backend tests:

> cd backend
> .\mvnw test