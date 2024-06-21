package com.codecamp;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test // This is a Java Annotation - They allow for extending java functionality
    public void getHellowWorldTest(){
        Main main = new Main(); // Create a copy of the Class
        String text = main.getHelloWorldText(); // Call a method in the class
        System.out.println(text); // Output Text
    }
    @Test
    public void mainTest() throws InterruptedException {
        String[] arguments = new String[0]; // No arguments we need to pass it
        Main.main(arguments);
    }

}
