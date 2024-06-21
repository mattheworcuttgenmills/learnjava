package com.codecamp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadReadFilesTest {
    private final String peopleA = "people.txt";
    private final String peopleB = "people1.txt";
    private final String peopleC = "people2.txt";
    private final String peopleD = "people3.txt";
    private Logger testLogger = Logger.getAnonymousLogger();

    public Charset getCharSet(){
        return StandardCharsets.UTF_8;
    }
    public void outputThreadResults(MultiThreadReadFiles mtrf){
        for(String item : mtrf.getResult()){
            testLogger.log(Level.INFO,"Thread [" + mtrf.getThreadNumber() + "] Result : " + item);
        }
    }
    @Test
    public void singleThreadTest() throws InterruptedException {
        MultiThreadReadFiles threadOne = new MultiThreadReadFiles(peopleA,getCharSet(),0);
        threadOne.start();
        threadOne.join();
        outputThreadResults(threadOne);
    }
    @Test
    public void doubleThreadTest() throws InterruptedException {
        MultiThreadReadFiles threadOne = new MultiThreadReadFiles(peopleA,getCharSet(),0);
        MultiThreadReadFiles threadTwo = new MultiThreadReadFiles(peopleB,getCharSet(),1);
        threadOne.start();
        threadOne.join();
        threadTwo.start();
        threadTwo.join();
        outputThreadResults(threadOne);
        outputThreadResults(threadTwo);

    }
    @Test
    public void tripleThreadTest() throws InterruptedException {
        MultiThreadReadFiles threadOne = new MultiThreadReadFiles(peopleA,getCharSet(),0);
        MultiThreadReadFiles threadTwo = new MultiThreadReadFiles(peopleB,getCharSet(),1);
        MultiThreadReadFiles threadThree = new MultiThreadReadFiles(peopleC,getCharSet(),2);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadOne.join();
        threadTwo.join();
        threadThree.join();

        outputThreadResults(threadOne);
        outputThreadResults(threadTwo);
        outputThreadResults(threadThree);
    }
    @Test
    public void quadrupleThreadTest() throws InterruptedException {
        MultiThreadReadFiles threadOne = new MultiThreadReadFiles(peopleA,getCharSet(),0);
        MultiThreadReadFiles threadTwo = new MultiThreadReadFiles(peopleB,getCharSet(),1);
        MultiThreadReadFiles threadThree = new MultiThreadReadFiles(peopleC,getCharSet(),2);
        MultiThreadReadFiles threadFour = new MultiThreadReadFiles(peopleD,getCharSet(),3);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();
        outputThreadResults(threadOne);
        outputThreadResults(threadTwo);
        outputThreadResults(threadThree);
        outputThreadResults(threadFour);
    }
}
