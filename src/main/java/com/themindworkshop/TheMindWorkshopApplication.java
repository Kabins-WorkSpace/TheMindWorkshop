package com.themindworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* @SpringBootApplication annotation combines three key annotations.
        -> @Configuration
              - Defines the class as a configuration class.
        -> @EnableAutoConfiguration
              - Enable Spring Boot's auto-configuration mechanism.
        -> @ComponentScan
              - Scans the package for spring managed components.
 */
public class TheMindWorkshopApplication {

    public static void main(String[] args) {
		SpringApplication.run(TheMindWorkshopApplication.class, args);
    }

}
