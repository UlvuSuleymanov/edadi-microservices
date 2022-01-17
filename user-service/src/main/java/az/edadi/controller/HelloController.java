package az.edadi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("user/hello")
    String hi() {
        return "Hello from User Service";
    }


}
