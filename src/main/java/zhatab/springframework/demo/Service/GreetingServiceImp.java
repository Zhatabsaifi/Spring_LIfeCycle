package zhatab.springframework.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {
    @Override
    public String sayGreeting() {
        return "---------Hello World ! ";
    }
}
// require to make a class is service class because this class provide the object of all controller
// use for primary injector
