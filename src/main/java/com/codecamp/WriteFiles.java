package com.codecamp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFiles {

    private String stringToWrite;
    private List<?> listToWrite;
    private String fileName;

    public WriteFiles(String fileName){}
    public WriteFiles(String fileNameToWrite, String strToWrite){
        stringToWrite = strToWrite;
        fileName = fileNameToWrite;
    }
    public WriteFiles(String fileNameToWrite, List<?> list){
        listToWrite = list;
        fileName = fileNameToWrite;
    }
    public void exportFileString (){
        File file = new File(fileName);
        try(FileWriter writer = new FileWriter(file)) {
            writer.write(stringToWrite);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void exportFileList() {
        File file = new File(fileName);
        try(FileWriter writer = new FileWriter(file)){
            writer.write(listToWrite.toString());
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
