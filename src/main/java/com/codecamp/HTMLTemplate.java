package com.codecamp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLTemplate {

    private String title;
    private String boilerplate;

    HTMLTemplate(String htmlTitle){
        setTitle(htmlTitle);
        addTitleToHtmlTemplate();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String pageTitle) {
        title = pageTitle;
    }
    public void addTitleToHtmlTemplate(){
        // Use escape characters to format your Strings
        /*
            \n - new line
            \" - display a single double quote
            \t - tab


         */
        boilerplate = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>" + title + "</title>\n" +
                "    <link rel=\"stylesheet\" href=\"./style.css\">\n" +
                "    <link rel=\"icon\" href=\"./favicon.ico\" type=\"image/x-icon\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <main>\n" +
                "        <h1>Welcome to " + title + "</h1>  \n" +
                "    </main>\n" +
                "\t<script src=\"index.js\"></script>\n" +
                "  </body>\n" +
                "</html>\n";
    }
    public void exportHtmlTemplate(){
        File file = new File("index.html");
        try(FileWriter writer = new FileWriter(file)) {
            writer.write(boilerplate);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
