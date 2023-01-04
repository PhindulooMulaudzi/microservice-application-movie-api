package net.mulaudzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieRatingsServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MovieRatingsServiceApplication.class, args);
	}

}
