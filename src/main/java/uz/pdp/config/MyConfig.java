package uz.pdp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"uz.pdp"}) /// project ichidagi barcha component annotatsiyalari qoyilgan classlar maxsus calasslarni qidirib topadi
public class MyConfig {
}
