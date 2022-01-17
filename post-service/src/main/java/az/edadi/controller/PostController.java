package az.edadi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("post/hello")
    String hi(){
        return "Hello from Post Service";
    }

}
