package org.example.catalogservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@SpringBootApplication
@ConfigurationPropertiesScan
class CatalogServiceApplication {

    static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication, args)
    }

}
