package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private static SetterInjectedController setterInjectedController = new SetterInjectedController();

    @BeforeAll
    static void setUp() {
        setterInjectedController = new SetterInjectedController();
    }

    @BeforeEach
    void setUpEach() {
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}