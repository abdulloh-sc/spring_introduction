package uz.pdp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import({MyConfig.class,MyConfig2.class})
@Configuration
public class MainMyConfig {
}
