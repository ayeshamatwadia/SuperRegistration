# Super Registration
An Angularjs spring-boot application that deals with a user registration and viewing of users all backed by a dockerized database ie this is a CRUD exercise using angular and spring boot

#Running the application
Backend spring-boot application

cd into the backend folder and run

mvn spring-boot:run

running the tests:

.\mvnw test

# starting up your postgres container
from the route run

docker-compose up -d

make sure the container is running using

docker container ls

you should see the container name: super_registration_db

to bring down and remove the container run:

docker-compose down
