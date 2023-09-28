# Microservice Application - Movie API

This project is an application developed using Spring Boot, aimed at demonstrating an understanding of the framework and showcasing a microservices architecture.

## Summary

The goal is to build an application that serves a catalog of movies a user has watched and rated. Below is a summary of what a user would see:

| Movie Name | Description         | Rating |
|------------|---------------------|--------|
| Toy Story  | A movie about...    | 5      |

This summary gives an indication of the application's intended functionality.

## Implementation

This project focuses on learning about microservices and will utilize Java and Spring Boot for development.

## Microservices

Three standalone microservices will be created using Spring Boot, each serving specific functions:

1. **movie-catalog-service**: The main application, responsible for serving REST endpoints `/catalog` and `/catalog/{userId}`. `/catalog` provides a map of users with their movie information locally. `/catalog/{userId}` provides movies and their details for a specific user, fetching data from `movie-info-service` and `movie-ratings-service`. Key endpoints are `/catalog` and potentially `/dashboard`.

2. **movie-info-service**: Serves available movies and their titles and descriptions. It has two endpoints: `/movies` for listing all available movies and `/movies/{movieId}` for specific movie information.

3. **movie-ratings-service**: Provides movie ratings information. It has endpoints `/ratings` to list all available movies with their respective ratings and `/ratings/{movieId}` to get ratings for a specific movie.

## Design and Implementation

The design and implementation will follow these principles:
- **Spring MVC Pattern**: Utilizing Spring MVC for structuring the application.
- **RestTemplate**: Employing RestTemplate for communication between microservices.
- **Service Discovery with Eureka**: Utilizing Eureka for service discovery within the microservices architecture.
- **Beans for RestTemplates**: Configuring RestTemplates using Beans for efficient usage.

## Getting Started

1. Clone this repository:
   ```sh
   git clone <repository_url>
   ```

2. Navigate to the project directory:
   ```sh
   cd <project_directory>
   ```

3. Build and run the microservices individually (e.g., `movie-catalog-service`, `movie-info-service`, `movie-ratings-service`).

4. Test the endpoints using tools like Postman or directly through the application.

## Contributing

Contributions are welcome! Feel free to submit issues or open pull requests to enhance the application.

## License

This project is licensed under the [MIT License](LICENSE).
