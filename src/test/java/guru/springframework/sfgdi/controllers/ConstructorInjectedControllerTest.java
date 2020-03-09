package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private static ConstructorInjectedController constructorInjectedController;

    @BeforeAll
    static void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}