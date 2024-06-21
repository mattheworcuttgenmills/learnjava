package com.codecamp;

import java.util.Objects;

/*
    This class is an example of what a Data Structure looked like before the "RECORD" type was added in
    Java 16-beta
 */
public class DataRecordExample {

    private final String name;
    private final int id;

    public DataRecordExample(String employeeName, int employeeId){
        this.name = employeeName;
        this.id = employeeId;

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        // Method Overrides String class toString method when called on this class
        // Outputs the entire "record" of data
        return "EmployeeClass(name=" + this.getName() + ", id=" + this.getId() + ")";
    }
    @Override
    public int hashCode(){
        // Method Overrides Objects class hashCode method when called on this class
        // Creates a Hashtable Entry using the name and id to create a unique record
        // This is used quick hashtable look-ups when added into Sets or Lists
        return Objects.hash(name,id);
    }
    @Override
    public boolean equals(final Object object){
        // Check if the object provided EQUALS (matches) this class
        if(this == object){
            return true;
        }
        // Check if the object provided EQUALS null
        if(object == null){
            return false;
        }
        // Check if this class ISNOTEQUAL to the object provided's class
        if(getClass() != object.getClass()){
            return false;
        }
        // Form a new Class from the object provided
        DataRecordExample employee = (DataRecordExample) object;
        // Return a TRUE OR FALSE. IF Objects.equals(variable of this class TO THE variable of the object provided)
        // AND Objects.equals(variable of this class TO THE variable of the object provided)...return true or false.
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }
}
