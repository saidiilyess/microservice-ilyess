package com.example.apiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
		return builder.routes()
				.route("microservice-candidats",r->r.path("/candidats/**")
						.uri("lb://MICROSERVICE-CANDIDATS") )
				.route("Job", r->r.path("/jobs/**")
						.uri("lb://JOB") )
				.route("microservice-user", r -> r.path("/api/auth/**")
						.uri("lb://MICROSERVICE-USER"))
				.route("tp-foyer", r -> r.path("/api/projects/**").uri("lb://TP-FOYER"))

				.build();
	}
}
