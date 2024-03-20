package Spring6DI.Spring.DI.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public static String sayHello() {

        System.out.println("I'm in the controller");

        return "Hello Everyone from Controller!!!";
    }

}
