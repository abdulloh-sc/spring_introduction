package uz.pdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private final Service service;

    @Autowired
    public UserController(@Qualifier("userService") Service service) {
        this.service = service;
    }
}
