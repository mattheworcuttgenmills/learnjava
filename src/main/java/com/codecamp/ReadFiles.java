package com.codecamp;

import java.io.BufferedReader;
import java.io.File; // To represent the file we're importing
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset; // Character Set to Interpret
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List; // Import List to store data from files
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFiles {

    public ReadFiles(){} // Default Constructor

    // Java NIO Method
    public List<String> readFile(String path, Charset charset){
        File file = new File(path);
        Path filePath = file.toPath();
        List<String> result = new ArrayList<>();
        try {
            // Method to Read line by line into a list
            result = Files.readAllLines(filePath, charset);
        }catch(IOException error){
            error.printStackTrace();
        }
        return result;
    }
    // Buffered Reader
    public List<String> readBufferedFile(String path){
        List<String> result = new ArrayList<>();
        try(FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
            ) {
            while(bufferedReader.ready()){
                result.add(bufferedReader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


}
