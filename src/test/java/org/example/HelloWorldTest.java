package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getHello() {
        System.out.println("Test is running.");
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.getHello());
        System.out.println("Test has finished.");
    }

    @Test
    void getNumber() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(8, helloWorld.getNumber());
    }
}