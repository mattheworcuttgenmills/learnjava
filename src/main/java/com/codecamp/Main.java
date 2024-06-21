package com.codecamp;

import org.jsoup.Jsoup; // Import One Class
import org.jsoup.*;     // Import All Classes

import java.nio.charset.StandardCharsets;
import java.util.*;     // Import Common Object Types

public class Main {
    public String getHelloWorldText(){
        // 2.) CONTINUE READING HERE
            // return   - java keyword to return a value from this method when called
            // new      - java keyword declaring a NEW copy of an object is created
            // String() - constructor for the String class
            // "Hello"  - text you want to be in that String object
        return new String("Hello World, I'm from the getHelloWorldText method!");
    }

    // 1.) START READING HERE
        // I'm a Comment !
        // TODO - I'm a TODO COMMENT (Same but Highlighted)
            /*
               1 I'm a Multi-line Comment
               2 (That's more than one!)
             */
        // public   - means this method(function) or variable can be accessed by other classes (can also be private)
        // static   - means this method or variable can be accessed without making a copy of the class
        // void     - this is the return type (meaning there is none, can be String,Int,boolean or any type)
        // main()   - this is the method name for this function (can be named to your liking)
        // String[] - this is the method Parameter type (can be any object type, this one is a String Array)
        // args     - this is the method argument name (this can be named whatever you want)
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello CodeCamp!"); // Output to Console
        System.out.println("Arguments : " + args.length); // Append a String with a number (integer)
        for(String item : args){ // Iterate through all arguments with a for loop and output to console
            System.out.println(item);
        }
        //--- Testing Instances ---
        InstanceExamples instanceExamples = new InstanceExamples(); // Calls a class
        String aName = "Jacky";
        String aColor = "Green";
        instanceExamples.createInstance(aName,aColor);

        //--- Set Class Level Variables ---
        String bName = "Allen";
        String bColor = "Red";
        instanceExamples.setName(bName); // Setter Method to directly assign values to class variables
        instanceExamples.setColor(bColor);
        instanceExamples.getNonInstance();

        //--- Reading User Input ---
        Scanner scanner = new Scanner(System.in); // scans for keyboard input from your keyboard
        String userInputName;
        System.out.println("Please Enter your Name then press [Enter]: "); // Prompt the User
        userInputName = scanner.nextLine(); // gets the "next line" the user enters and stores it in userInputName

        //--- Error Handling to Check User Input --
        if(userInputName != null){
            System.out.println("Your name is : " + userInputName);
            scanner.close();
        }else {
            System.out.println("Empty or invalid input entered");
            scanner.close();
        }
        //--- Reading Files ---
        ReadFiles readFiles = new ReadFiles();
        List<String> peopleList = readFiles.readBufferedFile("people.txt");
        //--- Writing Files ---
        // Note: Can do 1 class for both, but for purposes of demonstration, using 2
        WriteFiles writeFiles = new WriteFiles("listoutput.txt",peopleList);
        WriteFiles writeFiles2 = new WriteFiles("stringoutput.txt",peopleList.get(0));
        writeFiles.exportFileList();
        writeFiles2.exportFileString();

        //--- Testing Traditional Data Class vs Record Class ---
        // Old version of Java Class for representing Data Structures
        DataRecordExample employee = new DataRecordExample("Travis Barker",23502);
        System.out.println("DataRecordExample toString Method: " + employee.toString());

        //--- Testing new Record Class ---
        // New version of Java Class called "Record" for representing Data Structures
        EmployeeRecord record = new EmployeeRecord("Travis Barker",23502);
        System.out.println("EmployeeRecord    toString Method: " + record.toString());

        //--- Export an HTML Template file ---
        // Use a File Writer to export a new HTML page called index.html
        HTMLTemplate template = new HTMLTemplate("CodeCamp16");
        template.exportHtmlTemplate();


    }
}