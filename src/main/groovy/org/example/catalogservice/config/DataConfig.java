package org.example.catalogservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;


// In JPA audit listening doesn't happen automatically
// You should use EntityListener
@Configuration
@EnableJdbcAuditing
public class DataConfig {
}
