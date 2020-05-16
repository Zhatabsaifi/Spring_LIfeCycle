package zhatab.springframework.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zhatab.springframework.demo.Controller.MyController;

@SpringBootApplication
public class LifecycleSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(LifecycleSpringApplication.class, args);

        // use for primary bean
        System.out.println("---------- Primary Bean----------");
        MyController myController = (MyController) ctx.getBean("myController") ;
        System.out.println(myController.sayHello());

    }

}
