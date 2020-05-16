package zhatab.springframework.demo.Controller;

import org.springframework.stereotype.Controller;
import zhatab.springframework.demo.Service.GreetingService;

@Controller
public class MyController {

    // use for normal controller
//    public String sayHello() {
//        System.out.println("Hello world!");
//        return "Hi folks!";
//    }

    // use for primary Beans Controller
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
