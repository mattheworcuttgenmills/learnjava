package com.codecamp.genericstest;

import com.codecamp.generics.Optionals;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Supplier;

public class OptionalsTest {

    @Test
    public void getStringOptionalFromList(){
        List<?> stuff = Arrays.asList("Tommy",null,"Julie");
        int randomChoice = (int)(Math.random() * 3); // 0 to 3

        // Known Outcome Scenario and Long Hand
        switch(randomChoice){
            case 0:
                if( Optional.ofNullable(stuff.get(0)).isPresent() ){
                    // if a string of element zero exists....
                    System.out.println("Position [" + randomChoice + "] Value [" + stuff.get(randomChoice) + "]");
                }else{
                    System.out.println("Position [" + randomChoice + "] Value: [NullOrInvalid]");
                }
                break;
            case 1:
                if( Optional.ofNullable(stuff.get(1)).isPresent() ){
                    // if a string of element 1 exists....
                    System.out.println("Position [" + randomChoice + "] Value [" + stuff.get(randomChoice) + "]");
                }else{
                    System.out.println("Position [" + randomChoice + "] Value: [NullOrInvalid]");
                }
                break;
            case 2:
                if( Optional.ofNullable(stuff.get(2)).isPresent() ){
                    // if a string of element 2 exists....
                    System.out.println("Position [" + randomChoice + "] Value [" + stuff.get(randomChoice) + "]");
                }else{
                    System.out.println("Position [" + randomChoice + "] Value: [NullOrInvalid]");
                }
                break;
            default:
                System.out.println("No Valid Elements Found");
                break;

        }
    }
    @Test
    public void getStringOptionalFromListShorthand(){
        List<?> stuff = Arrays.asList("Tommy",null,"Julie",1,2,500,900.0,87f,400d, new String[]{"Bitty", "Betty", "Bother"});
        stuff.forEach( (item) -> {
            if(!Optional.ofNullable(item).isEmpty()) {
                if (item instanceof String) {
                    System.out.println("Class: " + item.getClass() + " Value: " + item);
                }
                if (item instanceof String[]) {
                    System.out.println("BEGIN STRING ARRAY");
                    for (String i : (String[]) item) {
                        System.out.println("Class: " + i.getClass() + " Value: " + i);
                    }
                    System.out.println("END STRING ARRAY");
                }
                if (item instanceof Integer) {
                    System.out.println("Class: " + item.getClass() + " Value: " + item);
                }
                if (item instanceof Double) {
                    System.out.println("Class: " + item.getClass() + " Value: " + item);
                }
                if (item instanceof Float) {
                    System.out.println("Class: " + item.getClass() + " Value: " + item);
                }
                if (item == null) {
                    System.out.println("Class: NONE " + " Value: " + "NULL");
                }
            }
        });
    }


}
