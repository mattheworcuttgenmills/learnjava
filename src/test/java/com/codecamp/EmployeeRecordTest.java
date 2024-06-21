package com.codecamp;

import org.junit.jupiter.api.Test;

public class EmployeeRecordTest {
    @Test
    public void createEmployeeRecordTest(){
        String empName = "Travis Barker";
        int empId = 23502;
        EmployeeRecord record = new EmployeeRecord(empName,23502);
        System.out.println(record.toString());
    }
}
