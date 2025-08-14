package com.test.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello" + name;
    }

    @GetMapping("/bye")
    public String sayBye(@RequestParam String name) {
        return "Bye" + name;
    }

}
