package com.codecamp.generics;

import java.awt.*;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {
    public Optionals(){}

    public static Optional<String> containsElement(String element){
        return Optional.ofNullable(element);
    }
    public static Optional<List> containsElement(List element){
        return Optional.ofNullable(element);
    }
}
