package uz.pdp.config;

import org.springframework.context.annotation.*;
import uz.pdp.DBIinitCondition;
import uz.pdp.DBInit;

@Import({MyConfig.class,MyConfig2.class})
@Configuration
@ImportResource(locations = "classpath:ioc-settings.xml")
@PropertySource("classpath:application.properties")
public class MainMyConfig {

    @Bean(name = "dbInitBean", initMethod = "init", destroyMethod = "destroy")
    @Conditional(DBIinitCondition.class)
    public DBInit dbInit(){
        return new DBInit();
    }
}
