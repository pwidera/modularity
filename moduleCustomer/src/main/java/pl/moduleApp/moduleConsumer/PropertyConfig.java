package pl.moduleApp.moduleConsumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:moduleCustomer.properties")
public class PropertyConfig {
}
