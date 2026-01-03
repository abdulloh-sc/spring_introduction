package uz.pdp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import({MyConfig.class,MyConfig2.class})
@Configuration
@ImportResource(locations = "classpath:ioc-settings.xml")
public class MainMyConfig {
}
