package uz.pdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.pdp.MyBean;
import uz.pdp.MyBean2;

@Configuration
public class MyConfig2 {
    /// maxsus calssni elon qilish uchun method hosil qilamiz va unga @Bean annotatsiyasini beramiz

    @Bean
    public MyBean2 myBean2(MyBean myBean) { /// MyBean2 ni maxsus class deb elon qildik va unga MyBean ni injecktion qildik
        return new MyBean2(myBean); /// Dependency Injection
    }
}
