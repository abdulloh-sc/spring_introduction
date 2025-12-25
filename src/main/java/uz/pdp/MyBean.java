package uz.pdp; /// maxsus class

import org.springframework.stereotype.Component;

@Component  /// metadata qo'shib beradi springga
public class MyBean {
    public void hi() {
        System.out.println("=== Hello from MyBean! ===");
    }
}
