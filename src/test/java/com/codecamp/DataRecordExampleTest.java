package com.codecamp;

import org.junit.jupiter.api.Test;

public class DataRecordExampleTest {
    @Test
    public void dataRecordExampleConstructorTest(){
        String empName = "Travis Barker";
        int empId = 8593204;
        DataRecordExample record = new DataRecordExample(empName,empId);
        System.out.println(record.getName());
        System.out.println(record.getId());
    }
    @Test
    public void dataRecordExampleToStringTest(){
        String empName = "Travis Barker";
        int empId = 8593204;
        DataRecordExample record = new DataRecordExample(empName,empId);
        System.out.println(record.toString());
    }
}
