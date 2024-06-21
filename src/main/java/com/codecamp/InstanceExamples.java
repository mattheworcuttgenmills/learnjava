package com.codecamp;

public class InstanceExamples {

    private String exampleName;
    private String exampleColor;
    public InstanceExamples(){} // Constructor

    public void createInstance(String name,String color){
        this.exampleName = name; // this keyword refers to this class (InstanceExamples)
        this.exampleColor = color; // this.variablename is this methods execution, the values are equal to VALUE
        System.out.println("Instance [this.exampleName] : " + this.exampleName);
        System.out.println("Instance [this.exampleColor]: " + this.exampleColor);
    }
    public void getNonInstance(){
        System.out.println("ClassVariable [exampleName] : " + exampleName);
        System.out.println("ClassVariable [exampleColor]: " + exampleColor);
    }
    public void setName(String name){
       exampleName = name;
    }
    public void setColor(String color){
        exampleColor = color;
    }
    public String getExampleName(){
        if(exampleName == null){
            return "NOT SET";
        }
        return exampleName;
    }
    public String getExampleColor(){
        if(exampleColor == null) {
            return "NOT SET";
        }
        return exampleColor;
    }


}
