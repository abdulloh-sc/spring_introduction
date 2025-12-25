package uz.pdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.pdp.MyBean;
import uz.pdp.MyBean2;

@Configuration
public class MyConfig {
    /// maxsus calssni elon qilish uchun method hosil qilamiz va unga @Bean annotatsiyasini beramiz


    @Bean /// MyBean ni maxsus class deb elon qildik
    public MyBean myBean() { /// oddiy class
        return new MyBean();
    }

    @Bean
    public MyBean2 myBean2(MyBean myBean) { /// MyBean2 ni maxsus class deb elon qildik va unga MyBean ni injecktion qildik
        return new MyBean2(myBean); /// Dependency Injection
    }
}
