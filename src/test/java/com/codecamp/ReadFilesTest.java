package com.codecamp;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ReadFilesTest {
    @Test
    public void readFileTest(){
        String peopleFilepath = "people.txt"; // File Name
        Charset set = StandardCharsets.UTF_8; // Character Set
        ReadFiles readFiles = new ReadFiles(); // Copy of Object
        List<String> fileContent = readFiles.readFile(peopleFilepath,set); // Call readfile Method

        if(fileContent.size() > 0) { // Check if there's any entries
            for (String line : fileContent) { // Loop, For each String TYPE in List of Strings
                System.out.println(line); // Output that String Value
            }
        }
    }
    @Test
    public void readBufferedFileTest(){
        String peopleFilepath = "people.txt"; // File Name
        ReadFiles readFiles = new ReadFiles(); // Copy of Object (no charset required, assumed Unicode Valid)
        List<String> fileContent = readFiles.readBufferedFile(peopleFilepath); // Call readBufferedFile Method

        if(fileContent.size() > 0) { // Check if there's any entries
            for (String line : fileContent) { // Loop, For each String TYPE in List of Strings
                System.out.println(line); // Output that String Value
            }
        }
    }
}
