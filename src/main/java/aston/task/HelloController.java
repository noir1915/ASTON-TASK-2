package aston.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("say")
public class HelloController {
    @GetMapping(value = "hello")
    public String sayHello() {
        return "2 ночи не спал, делал, получилось!!! е-маё";
    }
} 