# microservice-application-movie-api
This is an application developed using Springboot to demonstrate understanding of the framework

# Summary:
We want to build an application that serves a catalog of movies that a user has watched and rated. The below is a summary of what you would see for a user.
Table 1: User(Phindulo)
\Movie name\ Description \Rating\
\Toy Story \ movie about... \ 5\
The above should give an indication of what we are trying to achieve.

#Implimentation
We are doing this project so that we can learn about microservices. We will be using Java and SpringBoot.

#Microservices
We will have a total of three Microservices that will be standalone SpringBoot Applications. The are listed below as well as their functions.
*	movie-catalog-service: Main application, it will serve the Rest endpoints \catalog and \catalog\{userId}. \catalog will give the Map of users that currently have their information entered, this will be information local to the service. The Map<k,v> will be such that k is the userId and v is a list of movies. \catalog\{userId} will give all the movies for {userId} in the format {Title, Description, Rating}. The information served by \catalog\{userId} will be fetched from movie-info-service and movie-ratings-service. The core endpoints for this service is mostly just \catalog . Idealy we will have hyper links where you can click on the list of movies for each user and then get the description and rating but meh. Probably add \dashboard
*	movie-info-service: This service serves the available movies and a movie title and the description. It will have two endpoints \movies and \movies\{movieId}. \movies give a list of all movies available and \movies\{movieId} gives specific movie information.
*	movie-ratings-service: : This service serves the available ratings for each movie. It will have two endpoints \ratings and \ratings\{movieId}. \ratings give a list of all available movies and their respective ratings and \ratings\{movieId} gives specific movie ratings information.
Design and Implimentation
*	We will be using Spring MVC patter and RestTemplate for each Microservice. We will also use Eureka for service discory. And lastly we will also use Beans for out RestTemplates.
