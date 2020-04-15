package pl.moduleApp.moduleConsumer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Configuration
@EnableJpaRepositories(basePackages = "pl.moduleApp", includeFilters = @ComponentScan.Filter(Repository.class))
@EntityScan(basePackages = "pl.moduleApp")
public class JPAConfig {
}
