package uz.pdp; /// maxsus class

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component  /// metadata qo'shib beradi springga
public class MyBean {
    public void hi() {
        System.out.println("=== Hello from MyBean! ===");
    }

    @PostConstruct
    private void init() {
        System.out.println("MyBean is initialized");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("MyBean is destroyed");
    }
}
