package com.codecamp;

import java.io.File; // To represent the file we're importing
import java.io.IOException;
import java.nio.charset.Charset; // Character Set to Interpret
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List; // Import List to store data from files
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadReadFiles extends Thread{
    private Charset characterSet;
    private Path filepath;
    private volatile List<String> threadsafeList;
    private int threadNumber;

    private Logger logger = Logger.getAnonymousLogger();
    public MultiThreadReadFiles(String path,Charset charset,int threadcount){
        filepath = new File(path).toPath();
        characterSet = charset;
        threadNumber = threadcount;
    }
    public void readFile(){
        try {
            threadsafeList = Files.readAllLines(filepath,characterSet);
            logger.log(Level.INFO,"Result: " + threadsafeList);
        }catch(IOException error){
            error.printStackTrace();
        }
    }
    public List<String> getResult(){
        return threadsafeList;
    }
    public void setFilepath(String path){
        filepath = new File(path).toPath();
    }
    public void setCharacterSet(Charset charset){
        characterSet = charset;
    }
    public int getThreadNumber(){
        return threadNumber;
    }
    @Override // This Overrides Threads.run() method and allows us to run anything inside in a thread.
    public void run() {
       logger.log(Level.INFO, LocalDateTime.now().getNano()+ "=== Starting Thread [" + threadNumber + "]" + currentThread());
       readFile();
       logger.log(Level.INFO, LocalDateTime.now().getNano() + "=== Ending Thread [" + threadNumber + "]" + currentThread());
    }
}
